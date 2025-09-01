package Heranca;

public class PessoaJuridica extends Pessoa {  // herdando Pessoa

    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String cnpj) {
        super(nome, telefone);   // chama o construtor da classe pai
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
