package src.com.LabSchool.cli;
import src.com.LabSchool.model.Aluno;
import src.com.LabSchool.repository.BancoDeDados;

import java.util.Scanner;

public class AtualizaMatricula {

    public static String atualizacaomatricula() {
        System.out.println("Informe a situação da matrícula:\n" +
                "Digite 1 para Ativo \n" +
                "Digite 2 para Irregular \n" +
                "Digite 3 para Atendimento pedagógico\n" +
                "Digite 4 para Inativo");
        String SituacaoMatricula = "";
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            SituacaoMatricula = "Ativo";
        }
        if (opcao == 2) {
            SituacaoMatricula = "Irregular";
        }
        if (opcao == 3) {
            SituacaoMatricula = "Atendimento pedagógico";
        }
        if (opcao == 4) {
            SituacaoMatricula = "Inativo";
        }
        return SituacaoMatricula;

    }
    public static void AtualizaAlunoExistente(BancoDeDados banco){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Informe o código do aluno:");
        int idAluno = scanner1.nextInt();
        Aluno aluno = banco.getAluno(idAluno);
        aluno.setSituacaodaMatricula(atualizacaomatricula());
        }
    }