// Define o pacote onde a classe está localizada
package uninter.cofrinho;

// Real é uma subclasse de Moeda
public class Real extends Moeda {
    // Construtor que recebe o valor da moeda e chama o construtor da superclasse
    public Real(double valor) {
        super(valor);
    }
    
    // Método para retornar informações sobre a moeda (sobrescrito da superclasse)
    @Override
    public String info() {
        return "Real: " + valor;
    }
    
    // Método para converter o valor da moeda (sobrescrito da superclasse)
    @Override
    public double converter() {
        return valor; // O valor já está em Real, então retorna o próprio valor
    }
}
