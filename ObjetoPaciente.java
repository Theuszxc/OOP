import java.util.Scanner;

public class ObjetoPaciente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Paciente paciente1 = new Paciente();

        System.out.println("Informe os dados do paciente: ");

        System.out.print("Nome: ");
        paciente1.setNome(ler.nextLine());

        System.out.print("Endereço: ");
        paciente1.setEndereco(ler.nextLine());

        System.out.print("Nível de escolaridade: ");
        paciente1.setNivelDeEscolaridade(ler.nextLine());

        System.out.print("Email: ");
        paciente1.setEmail(ler.nextLine());

        System.out.print("CPF: ");
        paciente1.setCpf(ler.nextLine());

        System.out.print("Data de nascimento: ");
        paciente1.setDataDeNascimento(ler.nextLine());

        System.out.print("Telefone: ");
        paciente1.setTelefone(ler.nextLine());

        System.out.print("Sexo (M ou F): ");
        paciente1.setSexo(ler.nextLine().charAt(0));

        System.out.println("\n----- Dados do Paciente -----");
        System.out.println("Nome: " + paciente1.getNome());
        System.out.println("Endereço: " + paciente1.getEndereco());
        System.out.println("Nível de escolaridade: " + paciente1.getNivelDeEscolaridade());
        System.out.println("Email: " + paciente1.getEmail());
        System.out.println("CPF: " + paciente1.getCpf());
        System.out.println("Data de nascimento: " + paciente1.getDataDeNascimento());
        System.out.println("Telefone: " + paciente1.getTelefone());
        System.out.println("Sexo: " + paciente1.getSexo());

        ler.close();
    }
}
