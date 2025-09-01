package veiculos;

public class Principal {
    public static void main(String[] args) {
        Automovel carro = new Automovel("Toyota", "zupra", 1994, "Laranja", 2, "2JZ-GTE");
        System.out.println("=== Dados do Automóvel ===");
        carro.exibirInfo();

        System.out.println();

        Moto moto = new Moto("Yamaha", "R15 ABS", 2025, "Preta", 155);
        System.out.println("=== Dados da Moto ===");
        moto.exibirInfo();
    }
}
