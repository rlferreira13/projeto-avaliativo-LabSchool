package src.com.LabSchool;
import src.com.LabSchool.repository.BancoDeDados;
import java.util.Scanner;

public class Menu {
    public static void MenuPrincipal() {
        BancoDeDados banco = new BancoDeDados();
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        while (opcao != 7) {
            System.out.println("###LabSchool 1.0### ");
            System.out.println("Digite a opção desejada : ");
            System.out.println("1 - Cadastro de Aluno\n" +
                    "2 - Cadastro de Pedagogo\n" +
                    "3 - Cadastro de Professor\n" +
                    "4 - Atualizar Situação da Matrícula\n" +
                    "5 - Novo atendimento Pegagógico\n" +
                    "6 - Relatórios e Listagens\n" +
                    "7 - Sair");
            opcao = scanner.nextInt();
            if (opcao == 1) CadastroAluno.NovoCadastro(banco);
            if (opcao == 2) CadastroPedagogo.NovoCadastro();
            if (opcao == 3) CadastroProfessor.NovoCadastro(banco);
            if (opcao == 4) AtualizaMatricula.AtualizaAlunoExistente(banco);
            if (opcao == 5) AtendimentoPedagogico.NovoAtendimento();
            if (opcao == 6) RelatorioseListagens.SelecionarOpcao();
        }
    }
}