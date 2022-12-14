package src.com.LabSchool.model;

public class Aluno extends Pessoa {
    private String SituacaodaMatricula;
    private Double Nota;
    private Integer TotaldeAtendimentosPedagogicos;

    public String getSituacaodaMatricula() {
        return SituacaodaMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "SituacaodaMatricula='" + SituacaodaMatricula + '\'' + ", Nota=" + Nota + ", TotaldeAtendimentosPedagogicos=" + TotaldeAtendimentosPedagogicos + ", Nome='" + Nome + '\'' + ", Telefone='" + Telefone + '\'' + ", DatadeNascimento='" + DatadeNascimento + '\'' + ", CPF='" + CPF + '\'' + ", Codigo=" + Codigo + '}';
    }

    public void setSituacaodaMatricula(String situacaodaMatricula) {
        SituacaodaMatricula = situacaodaMatricula;
    }

    public Double getNota() {
        return Nota;
    }

    public Integer getTotaldeAtendimentosPedagogicos() {
        return TotaldeAtendimentosPedagogicos;
    }

    public void setTotaldeAtendimentosPedagogicos() {
        TotaldeAtendimentosPedagogicos++;
    }

    public Aluno(String nome, String telefone, String datadeNascimento, String cpf, int codigo, String situacaodaMatricula, Double nota, int totaldeAtendimentosPedagogicos) {
        super(nome, telefone, datadeNascimento, cpf, codigo);
        SituacaodaMatricula = situacaodaMatricula;
        Nota = nota;
        TotaldeAtendimentosPedagogicos = totaldeAtendimentosPedagogicos;
    }

    @Override
    public int compareTo(Pessoa o) {
        return 0;
    }
}