package src.com.LabSchool;

import src.com.LabSchool.repository.BancoDeDados;

import java.util.Scanner;

public class CadastroProfessor {
    public static void NovoCadastro(BancoDeDados banco) {
        String formacaoAcademica = "";
        String experienciaemDev = "";
        String estado = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do professor:");
        String nomeProfessor = scanner.nextLine();
        System.out.println("Informe o telefone:");
        String telefoneProfessor = scanner.nextLine();
        System.out.println("Informe a data de nascimento:");
        String dataNascimentoProfessor = scanner.nextLine();
        System.out.println("Informe o CPF:");
        String cpfProfessor = scanner.nextLine();
        int idProfessor = banco.geradordeId();
        System.out.println("Informe a formação acadêmica:\n" +
                "Digite 1 para Graduação incompleta \n" +
                "Digite 2 para Graduação completa \n" +
                "Digite 3 para Mestrado\n" +
                "Digite 4 para Doutorado");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            formacaoAcademica = "Graduação incompleta";
        }
        if (opcao == 2) {
            formacaoAcademica = "Graduação completa";
        }
        if (opcao == 3) {
            formacaoAcademica = "Mestrado";
        }
        if (opcao == 4) {
            formacaoAcademica = "Doutorado";
        }
        System.out.println("Informe a experiência em desenvolvimento:\n" +
                "Digite 1 para Front-End \n" +
                "Digite 2 para Back-End \n" +
                "Digite 3 para Full-Stack");
        opcao = scanner.nextInt();
        if (opcao == 1) {
            experienciaemDev = "Front-End";
        }
        if (opcao == 2) {
            experienciaemDev = "Back-End";
        }
        if (opcao == 3) {
            experienciaemDev = "Full-Stack";
        }
        System.out.println("Situação do cadastro:\n" +
                "Digite 1 para Ativo \n" +
                "Digite 2 para Inativo \n");
        opcao = scanner.nextInt();
        if (opcao == 1) {
            estado = "Ativo";
        }
        if (opcao == 2) {
            estado = "Inativo";
        }
        Professor professor = new Professor(nomeProfessor,
                telefoneProfessor,
                dataNascimentoProfessor,
                cpfProfessor,
                idProfessor,
                formacaoAcademica,
                experienciaemDev,
                estado);
        banco.addProfessor(professor);
        System.out.println(banco.getListaGeral().toString());
    }
}
