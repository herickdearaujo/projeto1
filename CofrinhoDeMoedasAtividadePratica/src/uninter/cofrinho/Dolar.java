// Define o pacote ao qual esta classe pertence
package uninter.cofrinho;

// Declaração da classe Dolar que estende Moeda
public class Dolar extends Moeda {
    
    // Construtor da classe Dolar que recebe o valor da moeda como parâmetro
    public Dolar(double valor) {
        super(valor); // Chama o construtor da classe pai (Moeda) passando o valor como argumento
    }
    
    // Método sobrescrito da classe pai que retorna uma string com informações sobre a moeda
    @Override
    public String info() {
        return "Dólar: " + valor; // Retorna uma string informando o valor da moeda em dólar
    }
    
    // Método sobrescrito da classe pai que converte o valor da moeda para Real
    @Override
    public double converter() {
        return valor * 5.0; // Supondo a taxa de conversão para Real como 5.0
    }
}
