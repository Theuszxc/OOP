package Polimorfismo;

public class Home implements Computador {

    @Override
    public void ligar() {
        System.out.println("Computador Home ligando com configurações padrão...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando sistema Home de forma simples...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando computador Home com economia de energia...");
    }

    @Override
    public void carregandoSistema() {
        System.out.println("Carregando sistema operacional para tarefas do dia a dia...");
    }
}
