package veiculos;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, String cor, int cilindrada) {
        super(marca, modelo, ano, cor);
        this.cilindrada = cilindrada;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
