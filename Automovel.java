package veiculos;

public class Automovel extends Veiculo{
    private int numerosPortas;
    private String motor;

    public Automovel(String marca, String modelo, int ano, String cor, int numeroPortas, String motor) {
        super(marca, modelo, ano, cor);
        this.numerosPortas = numeroPortas;
        this.motor = motor;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Números de Portas: " + numerosPortas);
        System.out.println("Motor: " + motor);
    }
}
