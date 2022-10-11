package src.comLabSchool;

public abstract class Pessoa{
    protected String Nome;
    protected String Telefone;
    protected String DatadeNascimento;
    protected String CPF;
    protected String Codigo;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getDatadeNascimento() {
        return DatadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        DatadeNascimento = datadeNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }
}
