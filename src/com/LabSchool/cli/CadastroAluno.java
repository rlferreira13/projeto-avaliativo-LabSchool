package src.com.LabSchool.cli;

import src.com.LabSchool.model.Aluno;
import src.com.LabSchool.repository.BancoDeDados;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CadastroAluno {
    public static void NovoCadastro(BancoDeDados banco) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        String nomeAluno = scanner.nextLine();
        String telefoneAluno = "0";
        while (telefoneAluno.length() < 13){
            System.out.println("Informe o telefone (Exemplo:47 00000-0000):");
            telefoneAluno = scanner.nextLine();
        }
        String dataNascimentoAluno = "0";
        while (dataNascimentoAluno.length()< 8){
            System.out.println("Informe a data de nascimento:");
            dataNascimentoAluno = scanner.nextLine();
        }
        //Formatando o input de String em formato Data.
        Date formatadorData;
        try {
            formatadorData = new SimpleDateFormat("ddMMyyyy").parse(dataNascimentoAluno);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(formatadorData);
        //Fim do formatador da data.

        String cpfAluno = "0";
        while (cpfAluno.length() < 11){
            System.out.println("Informe o CPF >SEM PONTUAÇÃO< (Exemplo:01234567890):");
            cpfAluno = scanner.nextLine();
        }
        System.out.println("Informe a nota do processo seletivo:");
        Double notaAluno = scanner.nextDouble();
        int AtendimentosPedagogicos = 0;
        int idAluno = banco.geradordeIdAluno();
        String situacaoMatricula = AtualizaMatricula.atualizacaomatricula();

        Aluno aluno = new Aluno(nomeAluno,
                telefoneAluno,
                dataFormatada,
                cpfAluno,
                idAluno,
                situacaoMatricula,
                notaAluno,
                AtendimentosPedagogicos);
        banco.addAluno(aluno);
        System.out.printf("Aluno %s cadastrado com sucesso.Código %d.",nomeAluno,idAluno);
        System.out.println("");
    }
}
