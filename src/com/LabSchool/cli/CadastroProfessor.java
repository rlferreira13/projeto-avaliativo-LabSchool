package src.com.LabSchool.cli;

import src.com.LabSchool.model.Professor;
import src.com.LabSchool.repository.BancoDeDados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CadastroProfessor {
    public static void NovoCadastro(BancoDeDados banco) {
        String formacaoAcademica = "";
        String experienciaemDev = "";
        String estado = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do professor:");
        String nomeProfessor = scanner.nextLine();
        String telefoneProfessor = "0";
        while (telefoneProfessor.length() < 13) {
            System.out.println("Informe o telefone (Exemplo:47 00000-0000):");
            telefoneProfessor = scanner.nextLine();
        }
        String dataNascimentoProfessor = "0";
        while (dataNascimentoProfessor.length() < 8) {
            System.out.println("Informe a data de nascimento:");
            dataNascimentoProfessor = scanner.nextLine();
        }
        //Formatando o input de String em formato Data.
        Date formatadorData;
        try {
            formatadorData = new SimpleDateFormat("ddMMyyyy").parse(dataNascimentoProfessor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(formatadorData);
        //Fim do formatador da data.

        String cpfProfessor = "0";
        while (cpfProfessor.length() < 11) {
            System.out.println("Informe o CPF >SEM PONTUAÇÃO< (Exemplo:01234567890):");
            cpfProfessor = scanner.nextLine();
        }
        int idProfessor = banco.geradordeIdProfessor();
        int opcao = 0;
        while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
            System.out.println("Informe a formação acadêmica:\n" +
                    "Digite 1 para Graduação incompleta \n" +
                    "Digite 2 para Graduação completa \n" +
                    "Digite 3 para Mestrado\n" +
                    "Digite 4 para Doutorado");
            opcao = scanner.nextInt();
        }
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

        opcao = 0;
        while (opcao != 1 && opcao != 2 && opcao != 3){
            System.out.println("Informe a experiência em desenvolvimento:\n" +
                    "Digite 1 para Front-End \n" +
                    "Digite 2 para Back-End \n" +
                    "Digite 3 para Full-Stack");
            opcao = scanner.nextInt();
        }
        if (opcao == 1) {
            experienciaemDev = "Front-End";
        }
        if (opcao == 2) {
            experienciaemDev = "Back-End";
        }
        if (opcao == 3) {
            experienciaemDev = "Full-Stack";
        }

        opcao = 0;
        while (opcao != 1 && opcao != 2){
            System.out.println("Situação do cadastro:\n" +
                    "Digite 1 para Ativo \n" +
                    "Digite 2 para Inativo");
            opcao = scanner.nextInt();
        }
        if (opcao == 1) {
            estado = "Ativo";
        }
        if (opcao == 2) {
            estado = "Inativo";
        }
        Professor professor = new Professor(nomeProfessor,
                telefoneProfessor,
                dataFormatada,
                cpfProfessor,
                idProfessor,
                formacaoAcademica,
                experienciaemDev,
                estado);
        banco.addProfessor(professor);
        System.out.printf("Professor %s cadastrado com sucesso.Código %d.",nomeProfessor,idProfessor);
    }
}
