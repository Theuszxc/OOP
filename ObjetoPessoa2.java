import java.util.Scanner;

public class ObjetoPessoa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.println("Insira os dados da Pessoa 1:");

        System.out.print("Nome: ");
        pessoa1.setNome(scanner.nextLine());

        System.out.print("Idade: ");
        pessoa1.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Endereço: ");
        pessoa1.setEndereco(scanner.nextLine());

        System.out.print("Profissão: ");
        pessoa1.setProfissao(scanner.nextLine());


        System.out.println("\nInsira os dados da Pessoa 2:");

        System.out.print("Nome: ");
        pessoa2.setNome(scanner.nextLine());

        System.out.print("Idade: ");
        pessoa2.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Endereço: ");
        pessoa2.setEndereco(scanner.nextLine());

        System.out.print("Profissão: ");
        pessoa2.setProfissao(scanner.nextLine());

        // Exibindo os dados
        System.out.println("\n----- OBJETO 1 -----");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Profissão: " + pessoa1.getProfissao());

        System.out.println("\n----- OBJETO 2 -----");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("Profissão: " + pessoa2.getProfissao());
    }
}
