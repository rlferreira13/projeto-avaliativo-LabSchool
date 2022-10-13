package src.comLabSchool;

import repository.BancoDeDados;

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
        int idAluno = 1;
        System.out.println("Informe a situação da matrícula:\n" +
                "Digite 1 para Ativo \n" +
                "Digite 2 para Irregular \n" +
                "Digite 3 para Atendimento pedagógico\n" +
                "Digite 4 para Inativo");
        String SituacaoMatricula = "";
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
        Aluno aluno = new Aluno(nomeAluno,
                telefoneAluno,
                dataNascimentoAluno,
                cpfAluno,
                idAluno,
                SituacaoMatricula,
                notaAluno,
                AtendimentosPedagogicos);
        banco.addAluno(aluno);
        System.out.println(banco.toString());
    }
}
