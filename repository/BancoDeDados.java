package repository;

import src.comLabSchool.Aluno;

import java.util.ArrayList;

public class BancoDeDados {
    ArrayList ListaAluno = new ArrayList<>();
    ArrayList ListaProfessor = new ArrayList<>();
    ArrayList ListaPedagogo = new ArrayList<>();

    @Override
    public String toString() {
        return "BancoDeDados{" + "ListaAluno=" + ListaAluno + ", ListaProfessor=" + ListaProfessor + ", ListaPedagogo=" + ListaPedagogo + '}';
    }

    public void addAluno(Aluno aluno) {
        ListaAluno.add(aluno);
    }
}