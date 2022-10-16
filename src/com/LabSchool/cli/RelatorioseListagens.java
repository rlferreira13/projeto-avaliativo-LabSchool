package src.com.LabSchool.cli;

import src.com.LabSchool.repository.BancoDeDados;
import java.util.Scanner;

public class RelatorioseListagens {
    public static void SelecionarOpcao(BancoDeDados banco) {
        Scanner scanner = new Scanner(System.in);
        int opcaomenu = 0;
        while (opcaomenu != 1 && opcaomenu != 2 && opcaomenu != 3 && opcaomenu != 4 && opcaomenu !=5) {
            System.out.println("Informe o tipo de listagem/relatorio que gostaria de receber:\n" +
                    "Digite 1 para Listagem de pessoas\n" +
                    "Digite 2 para Relatório dos alunos\n" +
                    "Digite 3 para Relatório dos professores\n" +
                    "Digite 4 para Relatório dos  alunos com mais atendimentos pedagógicos\n" +
                    "Digite 5 para Relatório dos pedagogos com mais atendimentos pedagógicos");
            opcaomenu = scanner.nextInt();
        }
        if (opcaomenu == 1) {
            int opcaosubmenu = 0;
            while (opcaosubmenu != 1 && opcaosubmenu != 2 && opcaosubmenu != 3 && opcaosubmenu != 4) {
                System.out.println("Selecione o tipo de listagem:\n" +
                        "Digite 1 para alunos\n" +
                        "Digite 2 para professores\n" +
                        "Digite 3 para pedagogos\n" +
                        "Digite 4 para geral");
                opcaosubmenu = scanner.nextInt();
            }
            if (opcaosubmenu == 1) {
                banco.gerarListaAluno();
            }
            if (opcaosubmenu == 2) {
                banco.gerarlistaProfessor();
            }
            if (opcaosubmenu == 3) {
                banco.gerarlistaPedagogo();
            }
            if (opcaosubmenu == 4) {
                banco.gerarListaGeral();
            }
        }
        if (opcaomenu == 2) {
            int opcaosubmenu2 = 0;
            while (opcaosubmenu2 != 1 && opcaosubmenu2 != 2 && opcaosubmenu2 != 3 && opcaosubmenu2 != 4 && opcaosubmenu2 !=5){
                System.out.println("Selecione a situação dos alunos a serem mostradas:\n" +
                        "Digite 1 para Ativos\n" +
                        "Digite 2 para Irregulares\n" +
                        "Digite 3 para em Atendimento Pedagógico\n" +
                        "Digite 4 para Inativos\n" +
                        "Digite 5 para Todos");
                opcaosubmenu2 = scanner.nextInt();
            }
            if (opcaosubmenu2 == 1) {
                banco.gerarRelatorioAlunosAtivos();
            }
            if (opcaosubmenu2 == 2) {
                banco.gerarRelatorioAlunosIrregulares();
            }
            if (opcaosubmenu2 == 3) {
                banco.gerarRelatorioAlunosEmAtendimentoPedagogico();
            }
            if (opcaosubmenu2 == 4) {
                banco.gerarRelatorioAlunosInativos();
            }
            if (opcaosubmenu2 == 5) {
                banco.gerarRelatorioAlunos();
            }
        }
        if (opcaomenu == 3) {
            int opcaosubmenu3 = 0;
            while (opcaosubmenu3 != 1 && opcaosubmenu3 != 2 && opcaosubmenu3 != 3 && opcaosubmenu3 != 4){
                System.out.println("Selecione a experiência dos professores a serem mostradas:\n" +
                        "Digite 1 para Front-End\n" +
                        "Digite 2 para Back-End\n" +
                        "Digite 3 para Full-Stack\n" +
                        "Digite 4 para Todos");
                opcaosubmenu3 = scanner.nextInt();
            }
            if (opcaosubmenu3 == 1) {
                banco.gerarRelatorioProfessoresFrontEnd();
            }
            if (opcaosubmenu3 == 2) {
                banco.gerarRelatorioProfessoresBackEnd();
            }
            if (opcaosubmenu3 == 3) {
                banco.gerarRelatorioProfessoresFullStack();
            }
            if (opcaosubmenu3 == 4) {
                banco.gerarRelatorioProfessores();
            }
        }
        if (opcaomenu == 4) {
            banco.gerarRelatorioAlunosOrdenados();
        }
        if (opcaomenu == 5) {
            banco.gerarRelatorioPedagogosOrdenados();
        }
    }
}