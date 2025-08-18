import java.util.Scanner;

public class ObjetoFuncionario {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();

        System.out.println("Informe os dados do paciente: ");

        System.out.println("Nome: ");
        funcionario1.setNome(scan.nextLine());

        System.out.println("Endereço: ");
        funcionario1.setEndereco(scan.nextLine());

        System.out.println("Cpf: ");
        funcionario1.setCpf(scan.nextInt());
        scan.nextLine();

        System.out.println("Sexo (M ou F): ");
        funcionario1.setSexo(scan.next().charAt(0));
        scan.nextLine();

        System.out.println("Nível de Escolaridade: ");
        funcionario1.setNivelDeEscolaridade(scan.nextLine());

        System.out.println("Email: ");
        funcionario1.setEmail(scan.nextLine());

        System.out.println("Data de Admissão: ");
        funcionario1.setDataAdmissao(scan.nextInt());

        System.out.println("Data de Demissão: ");
        funcionario1.setDataDeDemissao(scan.nextInt());
        scan.nextLine();

        System.out.println("Cargo: ");
        funcionario1.setCargo(scan.nextLine());

        System.out.println("Telefone: ");
        funcionario1.setTelefone(scan.nextInt());


        System.out.println("--- Informações ---");

        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Endereço: " + funcionario1.getEndereco());
        System.out.println("Cpf: " + funcionario1.getCpf());
        System.out.println("Sexo: " + funcionario1.getSexo());
        System.out.println("Nivel de escolaridade: " + funcionario1.getNivelDeEscolaridade());
        System.out.println("Email: " + funcionario1.getEmail());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Data de Admissão: " + funcionario1.getDataAdmisao());
        System.out.println("Data de Demissão: " + funcionario1.getDataDeDemissao());
        System.out.println("Telefone: " + funcionario1.getTelefone());
    }
}
