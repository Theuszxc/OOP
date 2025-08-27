public class Carro {
    private String placa;
    private int numChassi;

    public Carro() {
        this.placa = "";
        this.numChassi = 0;
    }

    public Carro(String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
    }

    public Carro(String placa) {
        this.placa = placa;
        this.numChassi = 0;
    }


    public String getPlaca() {
        return placa;
    }

    public int getNumChassi() {
        return numChassi;
    }
}
