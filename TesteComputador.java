package Polimorfismo;

public class TesteComputador {
    public static void main(String[] args) {
        Computador c1 = new Gamer();
        Computador c2 = new Home();

        c1.ligar();
        c2.ligar();
    }
}
