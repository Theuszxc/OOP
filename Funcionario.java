package funcionarios;

public abstract class Funcionario {
    private long id;
    private String nome;
    private String telefone;
    private int matricula;
    private String endereco;

    public Funcionario(long id, String nome, String telefone, int matricula, String endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public abstract void calculaSalario();
}
