package src.com.LabSchool.cli;

import src.com.LabSchool.model.Aluno;
import src.com.LabSchool.repository.BancoDeDados;

import java.util.Scanner;

public class AtualizaMatricula {

    public static String atualizacaomatricula() {
        String situacaoMatricula = "";
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao !=1 && opcao!=2 &&opcao!=3 && opcao!=4) {
            System.out.println("Informe a situação da matrícula:\n" +
                    "Digite 1 para Ativo \n" +
                    "Digite 2 para Irregular \n" +
                    "Digite 3 para Atendimento pedagógico\n" +
                    "Digite 4 para Inativo");
            opcao = scanner.nextInt();
            if (opcao == 1) {
                situacaoMatricula = "Ativo";
            }
            if (opcao == 2) {
                situacaoMatricula = "Irregular";
            }
            if (opcao == 3) {
                situacaoMatricula = "Atendimento pedagógico";
            }
            if (opcao == 4) {
                situacaoMatricula = "Inativo";
            }
        }
        return situacaoMatricula;

    }

    public static void AtualizaAlunoExistente(BancoDeDados banco) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Informe o código do aluno:");
        int idAluno = scanner1.nextInt();
        Aluno aluno = banco.getAluno(idAluno);
        aluno.setSituacaodaMatricula(atualizacaomatricula());
        System.out.println("Atualização efetuado com sucesso.");
    }
}