package src.comLabSchool;

public class Aluno extends Pessoa {
    private String SituacaodaMatricula;
    private Double Nota;
    private Integer TotaldeAtendimentosPedagogicos;

    public Aluno(String SituacaodaMatricula, Double Nota, Integer TotaldeAtendimentosPedagogicos){
        this.TotaldeAtendimentosPedagogicos = TotaldeAtendimentosPedagogicos;
        this.SituacaodaMatricula = SituacaodaMatricula;
        this.Nota = Nota;
    }

}
