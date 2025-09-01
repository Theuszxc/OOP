package funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Jornada(1, "Negroso", "1539389", 1001, "Rua valtinho da 2", 25.0, 160));
        funcionarios.add(new Horista(2, "João", "1539393", 1002, "Rua creber amenon", 30.0, 100));
        funcionarios.add(new PessoaJuridica(3, "Empresa X", "112233", 1003, "Rua Colombo", 10000.0, 1500.0));

        for (Funcionario f : funcionarios) {
            f.calculaSalario();
        }
    }
}
