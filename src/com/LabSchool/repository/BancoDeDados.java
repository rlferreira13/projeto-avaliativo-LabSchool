package src.com.LabSchool.repository;
import src.com.LabSchool.Aluno;
import src.com.LabSchool.Professor;

import java.util.ArrayList;
public class BancoDeDados {
    ArrayList ListaGeral = new ArrayList<>();

    public void addProfessor(Professor professor) {
        ListaGeral.add(professor);
    }
    public void addAluno(Aluno aluno) {
        ListaGeral.add(aluno);
    }

    @Override
    public String toString() {
        return "BancoDeDados{" +
                "ListaGeral=" + ListaGeral +
                '}';
    }

    public ArrayList getListaGeral() {
        return ListaGeral;
    }
    public Integer geradordeId(){
        return ListaGeral.size();
    }
}
