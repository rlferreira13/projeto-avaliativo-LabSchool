package src.com.LabSchool.cli;

import src.com.LabSchool.model.Aluno;
import src.com.LabSchool.model.Pedagogo;
import src.com.LabSchool.repository.BancoDeDados;
import java.util.Scanner;

public class AtendimentoPedagogico {
    public static void NovoAtendimento(BancoDeDados banco) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = null;
        while (aluno == null ){
            System.out.println("Informe o código do aluno que recebeu atendimento pedagógico:");
            int idAluno = scanner.nextInt();
            aluno = banco.getAluno(idAluno);
            if (aluno ==null){
                System.out.println("Não há aluno cadastrado com o código informado.");
            }
        }
        Pedagogo pedagogo = null;
        while (pedagogo ==null){
            System.out.println("Informe o código do pedagogo que efetuou o atendimento:");
            int idPedagogo = scanner.nextInt();
            pedagogo = banco.getPedagogo(idPedagogo);
        }
        aluno.setTotaldeAtendimentosPedagogicos();
        pedagogo.setTotaldeAtendimentosPedagogicosEfetuados();
        System.out.printf("Atendimento do pedagogo %s, para o aluno %s gravado com sucesso.",pedagogo.getNome(),aluno.getNome());
        System.out.println("");
    }
}