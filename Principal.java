package Heranca;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Plintópolis", "(15) 9945-5251");
        System.out.println("Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());

        PessoaFisica pessoaFisica = new PessoaFisica("Felipão", "(15) 4328-5325", "125.543.797-97", "12.345.678-9");
        System.out.println("\nPessoa física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Telefone: " + pessoaFisica.getTelefone());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("RG : " + pessoaFisica.getRg());


        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa brobaga", "(15) 2355-3642", "12.465.243/3532-23");
        System.out.println("\nPessoa juridica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Telefone: " + pessoaJuridica.getTelefone());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
    }
}
