import java.util.Scanner;

public class ObjetoAviao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Aviao[] avioes = new Aviao[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe as características do avião " + (i + 1) + ":");

            Aviao aviao = new Aviao();

            System.out.print("Tipo: ");
            aviao.setTipo(scan.nextLine());

            System.out.print("Cor: ");
            aviao.setCor(scan.nextLine());

            System.out.print("Velocidade: ");
            aviao.setVelocidade(scan.nextInt());
            scan.nextLine();

            System.out.print("QtdDeAssento: ");
            aviao.setQtdeAssento(scan.nextInt());
            scan.nextLine();

            avioes[i] = aviao;

            System.out.println();
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("---- Características do avião " + (i + 1) + " ----");
            System.out.println("Tipo: " + avioes[i].getTipo());
            System.out.println("Cor: " + avioes[i].getCor());
            System.out.println("Velocidade: " + avioes[i].getVelocidade());
            System.out.println("QtdDeAssento: " + avioes[i].getQtdeAssento());
            System.out.println();
        }
    }
}
