package src.com.LabSchool.model;

public class Pedagogo extends Pessoa {
    private int totalAtendimentosPedagogicos;

    @Override
    public String toString() {
        return "Pedagogo{" +
                "totalAtendimentosPedagogicos=" + totalAtendimentosPedagogicos +
                ", Nome='" + Nome + '\'' +
                ", Telefone='" + Telefone + '\'' +
                ", DatadeNascimento='" + DatadeNascimento + '\'' +
                ", CPF='" + CPF + '\'' +
                ", Codigo=" + Codigo +
                '}';
    }

    public Pedagogo(String nome, String telefone, String datadeNascimento, String cpf, int codigo, int totalAtendimentosPedagogicos) {
        super(nome, telefone, datadeNascimento, cpf, codigo);
        this.totalAtendimentosPedagogicos = totalAtendimentosPedagogicos;
    }

    public int getTotalAtendimentosPedagogicosEfetuados() {
        return totalAtendimentosPedagogicos;
    }

    public void setTotaldeAtendimentosPedagogicosEfetuados() {
        totalAtendimentosPedagogicos++;
    }

    @Override
    public int compareTo(Pessoa o) {
        return 0;
    }
}