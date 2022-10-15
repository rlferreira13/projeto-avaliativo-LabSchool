package src.com.LabSchool;

import src.com.LabSchool.repository.BancoDeDados;

import java.util.Scanner;

public class CadastroAluno {
    public static void NovoCadastro(BancoDeDados banco) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        String nomeAluno = scanner.nextLine();
        System.out.println("Informe o telefone:");
        String telefoneAluno = scanner.nextLine();
        System.out.println("Informe a data de nascimento:");
        String dataNascimentoAluno = scanner.nextLine();
        System.out.println("Informe o CPF:");
        String cpfAluno = scanner.nextLine();
        System.out.println("Informe a nota do processo seletivo:");
        Double notaAluno = scanner.nextDouble();
        int AtendimentosPedagogicos = 0;
        int idAluno = banco.geradordeIdAluno();
        String SituacaoMatricula = AtualizaMatricula.atualizacaomatricula();

        Aluno aluno = new Aluno(nomeAluno,
                telefoneAluno,
                dataNascimentoAluno,
                cpfAluno,
                idAluno,
                SituacaoMatricula,
                notaAluno,
                AtendimentosPedagogicos);
        banco.addAluno(aluno);
        System.out.println(banco.getListaAluno().toString());

    }
}
