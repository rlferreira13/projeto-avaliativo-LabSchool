package src.comLabSchool;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("###LabSchool 1.0### ");
        System.out.println("Digite a opção desejada : ");
        System.out.println("1 - Cadastro de Aluno\n" +
                "2 - Cadastro de Pedagogo\n" +
                "3 - Cadastro de Professor\n" +
                "4 - Atualizar Situação da Matrícula\n" +
                "5 - Novo atendimento Pegagógico\n" +
                "6 - Relatórios e Listagens\n" +
                "7 - Sair");
        Integer opcao = scanner.nextInt();
    }
}