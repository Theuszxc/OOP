import java.util.Scanner;

public class ObjetoComputador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Computador[] computadores = new Computador[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe os componentes do computador " + (i + 1) + ":");

            Computador computador = new Computador();

            System.out.print("Gabinete: ");
            computador.setGabinete(scan.nextLine());

            System.out.print("Teclado: ");
            computador.setTeclado(scan.nextLine());

            System.out.print("Mouse: ");
            computador.setMouse(scan.nextLine());

            System.out.print("Monitor: ");
            computador.setMonitor(scan.nextLine());

            System.out.print("Placa Mãe: ");
            computador.setPlacaMae(scan.nextLine());

            System.out.print("Processador: ");
            computador.setProcessador(scan.nextLine());

            System.out.print("Fonte: ");
            computador.setFonte(scan.nextLine());

            System.out.print("Placa de Vídeo: ");
            computador.setPlacaDeVideo(scan.nextLine());

            System.out.print("Memória (em GB): ");
            computador.setMemoria(scan.nextInt());

            System.out.print("Armazenamento (em GB): ");
            computador.setArmazenamento(scan.nextInt());
            scan.nextLine(); // Limpa o buffer do scanner após nextInt()

            computadores[i] = computador;
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            Computador c = computadores[i];
            System.out.println("---- COMPONENTES DO COMPUTADOR " + (i + 1) + " ----");
            System.out.println("Gabinete: " + c.getGabinete());
            System.out.println("Teclado: " + c.getTeclado());
            System.out.println("Mouse: " + c.getMouse());
            System.out.println("Monitor: " + c.getMonitor());
            System.out.println("Placa Mãe: " + c.getPlacaMae());
            System.out.println("Processador: " + c.getProcessador());
            System.out.println("Fonte: " + c.getFonte());
            System.out.println("Placa de Vídeo: " + c.getPlacaDeVideo());
            System.out.println("Memória: " + c.getMemoria() + " GB");
            System.out.println("Armazenamento: " + c.getArmazenamento() + " GB");
            System.out.println();
        }
    }
}
