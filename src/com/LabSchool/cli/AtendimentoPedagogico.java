package src.com.LabSchool.cli;

import src.com.LabSchool.model.Aluno;
import src.com.LabSchool.model.Pedagogo;
import src.com.LabSchool.repository.BancoDeDados;

import java.util.Scanner;

public class AtendimentoPedagogico {
    public static void NovoAtendimento(BancoDeDados banco) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o código do aluno que recebeu atendimento pedagógico:");
        int idAluno = scanner.nextInt();
        System.out.println("Informe o código do pedagogo que efetuou o atendimento:");
        int idPedagogo = scanner.nextInt();
        Aluno aluno = banco.getAluno(idAluno);
        aluno.setTotaldeAtendimentosPedagogicos();

        Pedagogo pedagogo = banco.getPedagogo(idPedagogo);
        pedagogo.setTotaldeAtendimentosPedagogicosEfetuados();
    }
}
