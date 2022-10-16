package src.com.LabSchool.model;


public class Professor extends Pessoa {
    private String FormacaoAcademica;
    private String ExperienciaDev;
    private String Estado;

    public Professor(String nome, String telefone, String datadeNascimento, String cpf, int codigo,
                     String formacaoAcademica, String experienciaDev, String estado) {
        super(nome, telefone, datadeNascimento, cpf, codigo);
        FormacaoAcademica = formacaoAcademica;
        ExperienciaDev = experienciaDev;
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "FormacaoAcademica='" + FormacaoAcademica + '\'' +
                ", ExperienciaDev='" + ExperienciaDev + '\'' +
                ", Estado='" + Estado + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Telefone='" + Telefone + '\'' +
                ", DatadeNascimento='" + DatadeNascimento + '\'' +
                ", CPF='" + CPF + '\'' +
                ", Codigo=" + Codigo +
                '}';
    }

    public String getFormacaoAcademica() {
        return FormacaoAcademica;
    }

    public String getExperienciaDev() {
        return ExperienciaDev;
    }

    public String getEstado() {
        return Estado;
    }

    @Override
    public int compareTo(Pessoa o) {
        return 0;
    }
}
