import java.util.Scanner;
public class TestaConta {
    
    public static void main(String[] args) {
        int op = 0;  
       


        Conta c2 = new Conta();
        ContaCorrente c1 = new ContaCorrente();
        c1.titular = "Gus";
        c1.saldo = 20;
        c1.ativo = true;
        c1.transferir(c1,c2,23);
        System.out.println(c1.exibirSaldo()+"\n"+c2.exibirSaldo());
        c1.gerarTaxa();
        System.out.println(c1.exibirSaldo());



      
       System.out.println("Choose one of the following options " +
                "\n [1] - Incluir \n [2] - Consultar " +
                "\n [3] - Alterar\n [4] - Inativo\n " +
                "[5] - Sair");

    while (op != 5) {
        Scanner scanner = new Scanner(System.in);
        op = scanner.nextInt();



        switch (op) {
            case 1:
            teste.incluir();
            break;

            case 2:
            teste.consultar();
            break;

            case 3:
            teste.alterar();
            break;

            case 4:
            teste.inativo();
            break;

            case 5:
            System.out.println("Saindo...");
            break;


            default:
                System.out.println("ERRO");
            break;
        }
    }



    }
}
