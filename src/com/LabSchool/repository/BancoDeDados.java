package src.com.LabSchool.repository;
import src.com.LabSchool.model.Aluno;
import src.com.LabSchool.model.Pedagogo;
import src.com.LabSchool.model.Professor;

import java.util.ArrayList;
public class BancoDeDados {
    ArrayList<Aluno>ListaAluno = new ArrayList<>();
    ArrayList<Professor>ListaProfessor = new ArrayList<>();
    ArrayList <Pedagogo>ListaPedagogo = new ArrayList<>();

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

    public ArrayList getListaPedagogo() {
        return ListaPedagogo;
    }
    public ArrayList getListaAluno() {
        return ListaAluno;
    }
    public ArrayList getListaProfessor() {
        return ListaProfessor;
    }
    public Integer geradordeIdAluno(){
        return ListaAluno.size();
    }
    public Integer geradordeIdProfessor(){
        return ListaProfessor.size();
    }
    public Integer geradordeIdPedagogo(){
        return ListaPedagogo.size();
    }

    public Aluno getAluno(int id){
        for (Aluno aluno: ListaAluno){
            if (aluno.getCodigo()==id){
                return aluno;
            }
        }
        return null;
    }
    public Pedagogo getPedagogo(int id){
        for (Pedagogo pedagogo: ListaPedagogo){
            if (pedagogo.getCodigo()==id){
                return pedagogo;
            }
        }
        return null;
    }
    }