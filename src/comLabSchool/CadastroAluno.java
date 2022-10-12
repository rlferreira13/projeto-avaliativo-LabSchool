package src.comLabSchool;

import repository.BancoDeDados;

import java.util.Scanner;
public class CadastroAluno {
    public static void NovoCadastro() {
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
        System.out.println("Informe a situação da matricula");
        String SituacaoMatricula = scanner.nextLine();
//        System.out.println("Informe a situação da matrícula:\n" +
//                "Digite 1 para Ativo \n" +
//                "Digite 2 para Irregular \n" +
//                "Digite 3 para Atendimento pedagógico\n" +
//                "Digite 4 para Inativo");
//        int opcao = scanner.nextInt();
//        if (opcao == 1){
//            SituacaoMatricula = "Ativo";
//        }
//        if (opcao == 2){
//            SituacaoMatricula = "Irregular";
//        }
//        if (opcao == 3){
//            SituacaoMatricula = "Atendimento pedagógico";
//        }
//        if (opcao == 4){
//            SituacaoMatricula = "Inativo";
//        }

        Aluno aluno = new Aluno(nomeAluno,
                telefoneAluno,
                dataNascimentoAluno,
                cpfAluno,
                idAluno,
                SituacaoMatricula,
                notaAluno,
                AtendimentosPedagogicos);
    }
}
