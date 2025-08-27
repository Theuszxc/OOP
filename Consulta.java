import java.util.Date;

public class Consulta {
    private Date data;
    private String nomePaciente;
    private String nomeDentes;

    public Consulta() {
        this.data = new Date();
        this.nomePaciente = "";
        this.nomeDentes = "";
    }

    public Consulta(Date data, String nomePaciente, String nomeDentes) {
        this.data = data;
        this.nomePaciente = nomePaciente;
        this.nomeDentes = nomeDentes;
    }

    public Consulta(String nomePaciente) {
        this.data = new Date();
        this.nomePaciente = nomePaciente;
        this.nomeDentes = "";
    }

    // Getters
    public Date getData() {
        return data;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeDentes() {
        return nomeDentes;
    }
}
