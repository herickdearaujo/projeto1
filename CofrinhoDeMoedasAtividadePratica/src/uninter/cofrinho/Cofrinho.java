package uninter.cofrinho;

import java.util.ArrayList;

public class Cofrinho {
    // ArrayList para armazenar as moedas no cofrinho
    private ArrayList<Moeda> listaMoedas;

    // Construtor da classe Cofrinho
    public Cofrinho() {
        listaMoedas = new ArrayList<>(); // Inicializa a lista de moedas
    }

    // Método para adicionar uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    // Método para remover uma moeda do cofrinho
    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }

    // Método para listar as moedas presentes no cofrinho
    public void listagemMoedas() {
        for (Moeda moeda : listaMoedas) {
            System.out.println(moeda.info());
        }
    }

    // Método para calcular o total convertido de todas as moedas no cofrinho
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        
        return total;
    }

    // Método para retornar a lista de moedas presente no cofrinho
    public ArrayList<Moeda> getListaMoedas() {
        return listaMoedas;
    }

}
