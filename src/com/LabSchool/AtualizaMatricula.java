package src.com.LabSchool;
import src.com.LabSchool.repository.BancoDeDados;

import java.util.Scanner;

public class AtualizaMatricula {

    public static String atualizacaomatricula() {
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
        System.out.println("Informe o nome do aluno:");
        String aluno = scanner1.nextLine();

        }
    }