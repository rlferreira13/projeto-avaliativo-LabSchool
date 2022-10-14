package src.com.LabSchool;
import java.text.SimpleDateFormat;

public abstract class Pessoa {
    protected String Nome;
    protected String Telefone;
    protected String DatadeNascimento;
    protected String CPF;
    protected int Codigo;

    public String getNome() {
        return Nome;
    }

    public Pessoa(String nome, String telefone, String datadeNascimento, String cpf, int codigo) {
        Nome = nome;
        Telefone = telefone;
        DatadeNascimento = datadeNascimento;
        CPF = cpf;
        Codigo = codigo;
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
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        DatadeNascimento = datadeNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
}
