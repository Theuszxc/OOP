package Polimorfismo;

public class Gamer implements Computador {

    @Override
    public void ligar() {
        System.out.println("Computador Gamer ligando com RGB e alto desempenho...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando sistema Gamer com configurações de overclock...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando computador Gamer com salvamento automático de jogos...");
    }

    @Override
    public void carregandoSistema() {
        System.out.println("Carregando sistema operacional otimizado para jogos...");
    }
}
