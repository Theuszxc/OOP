public class Main {
    public static void main (String [] args) {

        Tema tema = new Tema();
        tema.setId(1);
        tema.setNome("Festa feira da foda");
        tema.setValorAluguel(1000.00);
        tema.setCorToalha("Rosa Choque");

        System.out.println("Tema: " + tema.getNome());
        System.out.println("Valor: R$" + tema.getValorAluguel());
        System.out.println("Cor da Toalha: " + tema.getCorToalha());

        Cliente cliente = new Cliente();
        cliente.setId(101);
        cliente.setNome("Roberto");
        cliente.setCpf("478.589.279-81");
        cliente.setTelefone("(15) 99614-8671");

        System.out.println("\nCliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
    }
}
