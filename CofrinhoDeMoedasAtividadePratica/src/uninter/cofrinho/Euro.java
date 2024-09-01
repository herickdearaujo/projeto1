package uninter.cofrinho; // Declaração do pacote

public class Euro extends Moeda { // Declaração da classe Euro, que estende a classe Moeda
    public Euro(double valor) { // Construtor da classe Euro
        super(valor); // Chama o construtor da superclasse Moeda
    }
    
    @Override
    public String info() { // Método para obter informações sobre a moeda
        return "Euro: " + valor; // Retorna uma string com o valor do Euro
    }
    
    @Override
    public double converter() { // Método para converter o valor do Euro para outra moeda (supondo a taxa de conversão para Real)
        return valor * 5.5; // Retorna o valor do Euro convertido para Real
    }
}
