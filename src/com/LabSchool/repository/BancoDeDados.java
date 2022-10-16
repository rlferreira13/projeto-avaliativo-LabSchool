package src.com.LabSchool.repository;

import src.com.LabSchool.model.Aluno;
import src.com.LabSchool.model.Pedagogo;
import src.com.LabSchool.model.Professor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class BancoDeDados {
    ArrayList<Aluno> ListaAluno = new ArrayList<>();
    ArrayList<Professor> ListaProfessor = new ArrayList<>();
    ArrayList<Pedagogo> ListaPedagogo = new ArrayList<>();

    public void addPedagogo(Pedagogo pedagogo) {
        ListaPedagogo.add(pedagogo);
    }

    public void addProfessor(Professor professor) {
        ListaProfessor.add(professor);
    }

    public void addAluno(Aluno aluno) {
        ListaAluno.add(aluno);
    }

    @Override
    public String toString() {
        return "BancoDeDados{" +
                "ListaAluno=" + ListaAluno +
                ", ListaProfessor=" + ListaProfessor +
                ", ListaPedagogo=" + ListaPedagogo +
                '}';
    }

    public Integer geradordeIdAluno() {
        return ListaAluno.size();
    }

    public Integer geradordeIdProfessor() {
        return ListaProfessor.size();
    }

    public Integer geradordeIdPedagogo() {
        return ListaPedagogo.size();
    }

    public Aluno getAluno(int id) {
        for (Aluno aluno : ListaAluno) {
            if (aluno.getCodigo() == id) {
                return aluno;
            }
        }
        return null;
    }
    public Pedagogo getPedagogo(int id) {
        for (Pedagogo pedagogo : ListaPedagogo) {
            if (pedagogo.getCodigo() == id) {
                return pedagogo;
            }
        }
        return null;
    }
    public ArrayList gerarListaGeral() {
        for (Aluno aluno : ListaAluno) {
            System.out.printf("Aluno: Código: %d, ", aluno.getCodigo());
            System.out.printf("Nome: %s, ", aluno.getNome());
            System.out.printf("CPF: %s. ", aluno.getCPF());
            System.out.println("");
        }
        for (Pedagogo pedagogo : ListaPedagogo) {
            System.out.printf("Pedagogo: Código: %d, ", pedagogo.getCodigo());
            System.out.printf("Nome: %s, ", pedagogo.getNome());
            System.out.printf("CPF: %s. ", pedagogo.getCPF());
            System.out.println("");
        }
        for (Professor professor : ListaProfessor) {
            System.out.printf("Professor: Código: %d, ", professor.getCodigo());
            System.out.printf("Nome: %s, ", professor.getNome());
            System.out.printf("CPF: %s. ", professor.getCPF());
            System.out.println("");
        }
        System.out.println("");
        return null;
    }
    public Aluno gerarListaAluno() {
        for (Aluno aluno : ListaAluno) {
            System.out.printf("Aluno: Código: %d, ", aluno.getCodigo());
            System.out.printf("Nome: %s, ", aluno.getNome());
            System.out.printf("CPF: %s. ", aluno.getCPF());
            System.out.println("");
        }
        System.out.println("");
        return null;
    }
    public Pedagogo gerarlistaPedagogo() {
        for (Pedagogo pedagogo : ListaPedagogo) {
            System.out.printf("Pedagogo: Código: %d, ", pedagogo.getCodigo());
            System.out.printf("Nome: %s, ", pedagogo.getNome());
            System.out.printf("CPF: %s. ", pedagogo.getCPF());
            System.out.println("");
        }
        System.out.println("");
        return null;
    }
    public Professor gerarlistaProfessor() {
        for (Professor professor : ListaProfessor) {
            System.out.printf("Professor: Código: %d, ", professor.getCodigo());
            System.out.printf("Nome: %s, ", professor.getNome());
            System.out.printf("CPF: %s. ", professor.getCPF());
            System.out.println("");
        }
        System.out.println("");
        return null;
    }
    public Aluno gerarRelatorioAlunosAtivos() {
        for (Aluno aluno : ListaAluno) {
            if (Objects.equals(aluno.getSituacaodaMatricula(), "Ativo")) {
                System.out.printf("Aluno: Código: %d, ", aluno.getCodigo());
                System.out.printf("Nome: %s, ", aluno.getNome());
                System.out.printf("Nota: %f. ", aluno.getNota());
                System.out.printf("Atendimentos Pedagógicos: %d. ", aluno.getTotaldeAtendimentosPedagogicos());
                System.out.println("");
            }
        }
        System.out.println("");
        return null;
    }
    public Aluno gerarRelatorioAlunosIrregulares() {
        for (Aluno aluno : ListaAluno) {
            if (Objects.equals(aluno.getSituacaodaMatricula(), "Irregular")) {
                System.out.printf("Aluno: Código: %d, ", aluno.getCodigo());
                System.out.printf("Nome: %s, ", aluno.getNome());
                System.out.printf("Nota: %f. ", aluno.getNota());
                System.out.printf("Atendimentos Pedagógicos: %d. ", aluno.getTotaldeAtendimentosPedagogicos());
                System.out.println("");
            }
        }
        System.out.println("");
        return null;
    }
    public Aluno gerarRelatorioAlunosEmAtendimentoPedagogico() {
        for (Aluno aluno : ListaAluno) {
            if (Objects.equals(aluno.getSituacaodaMatricula(), "Atendimento pedagógico")) {
                System.out.printf("Aluno: Código: %d, ", aluno.getCodigo());
                System.out.printf("Nome: %s, ", aluno.getNome());
                System.out.printf("Nota: %f. ", aluno.getNota());
                System.out.printf("Atendimentos Pedagógicos: %d. ", aluno.getTotaldeAtendimentosPedagogicos());
                System.out.println("");
            }
        }
        System.out.println("");
        return null;
    }
    public Aluno gerarRelatorioAlunosInativos() {
        for (Aluno aluno : ListaAluno) {
            if (Objects.equals(aluno.getSituacaodaMatricula(), "Inativo")) {
                System.out.printf("Aluno: Código: %d, ", aluno.getCodigo());
                System.out.printf("Nome: %s, ", aluno.getNome());
                System.out.printf("Nota: %f. ", aluno.getNota());
                System.out.printf("Atendimentos Pedagógicos: %d. ", aluno.getTotaldeAtendimentosPedagogicos());
                System.out.println("");
            }
        }
        System.out.println("");
        return null;
    }

    public Aluno gerarRelatorioAlunos() {
        for (Aluno aluno : ListaAluno) {
            System.out.printf("Aluno: Código: %d, ", aluno.getCodigo());
            System.out.printf("Nome: %s, ", aluno.getNome());
            System.out.printf("Nota: %f. ", aluno.getNota());
            System.out.printf("Atendimentos Pedagógicos: %d. ", aluno.getTotaldeAtendimentosPedagogicos());
            System.out.println("");
        }
        System.out.println("");
        return null;
    }

    public Professor gerarRelatorioProfessoresFrontEnd() {
        for (Professor professor : ListaProfessor) {
            if (Objects.equals(professor.getExperienciaDev(), "Front-End")) {
                System.out.printf("Professor: Código: %d, ", professor.getCodigo());
                System.out.printf("Nome: %s, ", professor.getNome());
                System.out.printf("Formação Acadêmica: %s. ", professor.getFormacaoAcademica());
                System.out.printf("Experiência: %s. ", professor.getExperienciaDev());
                System.out.printf("Estado: %s. ", professor.getEstado());
                System.out.println("");
            }
        }
        System.out.println("");
        return null;
    }

    public Professor gerarRelatorioProfessoresBackEnd() {
        for (Professor professor : ListaProfessor) {
            if (Objects.equals(professor.getExperienciaDev(), "Back-End")) {
                System.out.printf("Professor: Código: %d, ", professor.getCodigo());
                System.out.printf("Nome: %s, ", professor.getNome());
                System.out.printf("Formação Acadêmica: %s. ", professor.getFormacaoAcademica());
                System.out.printf("Experiência: %s. ", professor.getExperienciaDev());
                System.out.printf("Estado: %s. ", professor.getEstado());
                System.out.println("");
            }
        }
        System.out.println("");
        return null;
    }

    public Professor gerarRelatorioProfessoresFullStack() {
        for (Professor professor : ListaProfessor) {
            if (Objects.equals(professor.getExperienciaDev(), "Full-Stack")) {
                System.out.printf("Professor: Código: %d, ", professor.getCodigo());
                System.out.printf("Nome: %s, ", professor.getNome());
                System.out.printf("Formação Acadêmica: %s. ", professor.getFormacaoAcademica());
                System.out.printf("Experiência: %s. ", professor.getExperienciaDev());
                System.out.printf("Estado: %s. ", professor.getEstado());
                System.out.println("");
            }
        }
        System.out.println("");
        return null;
    }

    public Professor gerarRelatorioProfessores() {
        for (Professor professor : ListaProfessor) {
            System.out.printf("Professor: Código: %d, ", professor.getCodigo());
            System.out.printf("Nome: %s, ", professor.getNome());
            System.out.printf("Formação Acadêmica: %s. ", professor.getFormacaoAcademica());
            System.out.printf("Experiência: %s. ", professor.getExperienciaDev());
            System.out.printf("Estado: %s. ", professor.getEstado());
            System.out.println("");
        }
        System.out.println("");
        return null;
    }

    public Aluno gerarRelatorioAlunosOrdenados() {
        Collections.sort(ListaAluno);
        for (Aluno aluno : ListaAluno) {
            System.out.printf("Aluno: Código: %d, ", aluno.getCodigo());
            System.out.printf("Nome: %s, ", aluno.getNome());
            System.out.printf("Atendimentos Pedagógicos: %d. ", aluno.getTotaldeAtendimentosPedagogicos());
            System.out.println("");
        }
        System.out.println("");
        return null;
    }

    public Pedagogo gerarRelatorioPedagogosOrdenados() {
        Collections.sort(ListaPedagogo);
        for (Pedagogo pedagogo : ListaPedagogo) {
            System.out.printf("Aluno: Código: %d, ", pedagogo.getCodigo());
            System.out.printf("Nome: %s, ", pedagogo.getNome());
            System.out.printf("Atendimentos Pedagógicos: %d. ", pedagogo.getTotalAtendimentosPedagogicosEfetuados());
            System.out.println("");
        }
        System.out.println("");
        return null;
    }
}