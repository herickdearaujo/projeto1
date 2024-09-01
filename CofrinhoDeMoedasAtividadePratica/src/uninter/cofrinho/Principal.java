package uninter.cofrinho;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Instanciando o cofrinho e o scanner
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar moeda(s)");
            System.out.println("2 - Remover moeda(s)");
            System.out.println("3 - Listar moeda(s)");
            System.out.println("4 - Converter");
            System.out.println("5 - Desligar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionando moeda(s) ao cofrinho
                    System.out.println("Escolha o tipo de moeda:");
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    int tipo = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();

                    Moeda moeda;
                    if (tipo == 1) {
                        moeda = new Dolar(valor);
                    } else if (tipo == 2) {
                        moeda = new Euro(valor);
                    } else {
                        moeda = new Real(valor);
                    }

                    cofrinho.adicionar(moeda);
                    break;
                
                case 2:
                    // Removendo moeda(s) do cofrinho
                    System.out.print("Digite o valor da moeda que será removido: ");
                    valor = scanner.nextDouble();
                    Moeda moedaParaRemover = null;

                    for (Moeda m : cofrinho.getListaMoedas()) {
                        if (m.getValor() == valor) {
                            moedaParaRemover = m;
                            break;
                        }
                    }

                    if (moedaParaRemover != null) {
                        cofrinho.remover(moedaParaRemover);
                        System.out.println("Moeda removida.");
                    } else {
                        System.out.println("Moeda não encontrada.");
                    }
                    break;

                case 3:
                    // Listando moedas do cofrinho
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                    // Convertendo moedas para Real
                    double total = cofrinho.totalConvertido();
                    System.out.println("Total convertido em Real: " + total);
                    break;

                case 5:
                    // Encerrando o programa
                    System.out.println("Saindo...");
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close(); // Fechando o scanner
    }
}
