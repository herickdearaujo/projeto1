package uninter.cofrinho;

// Classe abstrata Moeda
public abstract class Moeda {
    // Atributo protegido valor
    protected double valor;
    
    // Construtor da classe Moeda
    public Moeda(double valor) {
        this.valor = valor;
    }
    
    // Método para obter o valor da moeda
    public double getValor() {
        return valor;
    }
    
    // Método abstrato para retornar informações sobre a moeda
    public abstract String info();
    
    // Método abstrato para converter o valor da moeda
    public abstract double converter();
}
