package src.com.LabSchool.model;


public abstract class Pessoa implements Comparable<Pessoa> {
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

    public String getCPF() {
        return CPF;
    }

    public int getCodigo() {
        return Codigo;
    }

}