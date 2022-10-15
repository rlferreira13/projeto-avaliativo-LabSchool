package src.com.LabSchool;

import src.com.LabSchool.repository.BancoDeDados;

import java.util.Scanner;

public class CadastroPedagogo {
    public static void NovoCadastro(BancoDeDados banco) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o nome do pedagogo:");
            String nomePedagogo = scanner.nextLine();
            System.out.println("Informe o telefone:");
            String telefonePedagogo = scanner.nextLine();
            System.out.println("Informe a data de nascimento:");
            String dataNascimentoPedagogo = scanner.nextLine();
            System.out.println("Informe o CPF:");
            String cpfPedagogo = scanner.nextLine();
            int AtendimentosPedagogicos = 0;
            int idPedagogo = banco.geradordeIdPedagogo();

        Pedagogo pedagogo = new Pedagogo(nomePedagogo,
                telefonePedagogo,
                dataNascimentoPedagogo,
                cpfPedagogo,
                idPedagogo,
                AtendimentosPedagogicos);
        banco.addPedagogo(pedagogo);
        System.out.println(banco.getListaPedagogo().toString());
    }
}
