package src.comLabSchool;

public class Aluno extends Pessoa {
    private String SituacaodaMatricula;
    private Double Nota;
    private Integer TotaldeAtendimentosPedagogicos;

    public String getSituacaodaMatricula() {
        return SituacaodaMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "SituacaodaMatricula='" + SituacaodaMatricula + '\'' +
                ", Nota=" + Nota +
                ", TotaldeAtendimentosPedagogicos=" + TotaldeAtendimentosPedagogicos +
                ", Nome='" + Nome + '\'' +
                ", Telefone='" + Telefone + '\'' +
                ", DatadeNascimento='" + DatadeNascimento + '\'' +
                ", CPF='" + CPF + '\'' +
                ", Codigo=" + Codigo +
                '}';
    }

    public void setSituacaodaMatricula(String situacaodaMatricula) {
        SituacaodaMatricula = situacaodaMatricula;
    }

    public Double getNota() {
        return Nota;
    }

    public void setNota(Double nota) {
        Nota = nota;
    }

    public Integer getTotaldeAtendimentosPedagogicos() {
        return TotaldeAtendimentosPedagogicos;
    }

    public void setTotaldeAtendimentosPedagogicos(Integer totaldeAtendimentosPedagogicos) {
        TotaldeAtendimentosPedagogicos = totaldeAtendimentosPedagogicos;
    }

    public Aluno(String nome, String telefone, String datadeNascimento, String cpf, int codigo,
                 String situacaodaMatricula, Double nota, Integer totaldeAtendimentosPedagogicos) {
        super(nome, telefone, datadeNascimento, cpf, codigo);
        SituacaodaMatricula = situacaodaMatricula;
        Nota = nota;
        TotaldeAtendimentosPedagogicos = totaldeAtendimentosPedagogicos;
    }
}
