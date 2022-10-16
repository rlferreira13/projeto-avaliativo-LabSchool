package src.com.LabSchool.cli;
import src.com.LabSchool.model.Pedagogo;
import src.com.LabSchool.repository.BancoDeDados;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CadastroPedagogo {
    public static void NovoCadastro(BancoDeDados banco) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do pedagogo:");
        String nomePedagogo = scanner.nextLine();

        String telefonePedagogo = "";
        while (telefonePedagogo.length() < 13){
            System.out.println("Informe o telefone (Exemplo:47 00000-0000):");
            telefonePedagogo = scanner.nextLine();
        }
        String dataNascimentoPedagogo = "0";
        while (dataNascimentoPedagogo.length()< 8){
            System.out.println("Informe a data de nascimento:");
            dataNascimentoPedagogo = scanner.nextLine();
        }
        //Formatando o input de String em formato Data.
        Date formatadorData;
        try {
            formatadorData = new SimpleDateFormat("ddMMyyyy").parse(dataNascimentoPedagogo);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(formatadorData);
        //Fim do formatador da data.

        String cpfPedagogo = "0";
        while (cpfPedagogo.length() < 11) {
            System.out.println("Informe o CPF >SEM PONTUAÇÃO< (Exemplo:01234567890):");
            cpfPedagogo = scanner.nextLine();
        }
        int atendimentosPedagogicos = 0;
        int idPedagogo = banco.geradordeIdPedagogo();

        Pedagogo pedagogo = new Pedagogo(nomePedagogo,
                telefonePedagogo,
                dataFormatada,
                cpfPedagogo,
                idPedagogo,
                atendimentosPedagogicos);
        banco.addPedagogo(pedagogo);
        System.out.printf("Pedagogo %s cadastrado com sucesso.Código %d.",nomePedagogo,idPedagogo);
    }
}
