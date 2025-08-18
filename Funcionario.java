public class Funcionario {
    String nome, endereco, cargo ,nivelDeEscolaridade, email;
    int cpf, dataAdmissao, dataDeDemissao, telefone;
    char sexo;

    public String getNome(){
        return  nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo(){
        return  cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getNivelDeEscolaridade() {
        return nivelDeEscolaridade;
    }
    public void setNivelDeEscolaridade(String nivelDeEscolaridade){
        this.nivelDeEscolaridade = nivelDeEscolaridade;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getDataAdmisao(){
        return dataAdmissao;
    }
    public void setDataAdmissao(int dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }
    public int getDataDeDemissao(){
        return dataDeDemissao;
    }
    public void setDataDeDemissao(int dataDeDemissao){
        this.dataDeDemissao = dataDeDemissao;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
}
