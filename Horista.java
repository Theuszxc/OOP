package funcionarios;

public class Horista extends Funcionario {
    private double valorHora;
    private int quantidadeHoras;

    public Horista(long id, String nome, String telefone, int matricula, String endereco,
                   double valorHora, int quantidadeHoras) {
        super(id, nome, telefone, matricula, endereco);
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }


    public void calculaSalario() {
        double salario = valorHora * quantidadeHoras;
        System.out.println("Horista - Salário: R$ " + salario);
    }
}
