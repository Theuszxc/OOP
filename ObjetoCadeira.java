import java.util.Scanner;

public class ObjetoCadeira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cadeira[] cadeiras = new Cadeira[5];


        for (int i = 0; i < 5; i++) {
            cadeiras[i] = new Cadeira();

            System.out.println("Cadeira " + (i + 1) + ":");

            System.out.println("Modelo: ");
            cadeiras[i].setModelo(scan.nextLine());

            System.out.println("Cor: ");
            cadeiras[i].setCor(scan.nextLine());

            System.out.println("Material: ");
            cadeiras[i].setMaterial(scan.nextLine());

            System.out.println("Peso: ");
            cadeiras[i].setPeso(scan.nextLine());
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("---- DESCRIÇÃO DA CADEIRA "+ (i + 1) + " ----");
            System.out.println("Cadeira " + (i + 1) + ":");
            System.out.println("Modelo: " + cadeiras[i].getModelo());
            System.out.println("Cor: " + cadeiras[i].getCor());
            System.out.println("Material: " + cadeiras[i].getMaterial());
            System.out.println("Peso: " + cadeiras[i].getPeso());
        }
    }
}
