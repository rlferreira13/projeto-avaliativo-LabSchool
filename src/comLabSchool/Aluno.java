package src.comLabSchool;

public class Aluno extends Pessoa {
    private String SituacaodaMatricula;
    private Double Nota;
    private Integer TotaldeAtendimentosPedagogicos;

    public Aluno(String nome, String telefone, String datadeNascimento, String cpf, int codigo, String situacaodaMatricula, Double nota, Integer totaldeAtendimentosPedagogicos) {
        super(nome, telefone, datadeNascimento, cpf, codigo);
        SituacaodaMatricula = situacaodaMatricula;
        Nota = nota;
        TotaldeAtendimentosPedagogicos = totaldeAtendimentosPedagogicos;
    }
}
