import java.util.Scanner;
public class interfaceBanco {

    Conta[] contas = new Conta[10];
    Scanner scanner = new Scanner(System.in);



    public void incluir()
    {

    try {
        Conta conta = new Conta();
        System.out.println("Titular:");
        String nome = scanner.nextLine();
        conta.titular = nome;
        System.out.println("Número:");
        int num = scanner.nextInt();
        conta.num = num;
        System.out.println("Saldo:");
        float saldo = scanner.nextFloat();
        conta.saldo = saldo;
        conta.ativo = true;
        contas[0] = conta;

    } catch (Exception e) {
        System.out.println("ERRO" + e);
    }

    }
    public void consultar()
    {
        for(int i = 0; i < contas.length;i++){
            System.out.println(contas[i]);
            
        }
    }
    public void alterar()
    {

    }
    public void inativo()
    {
        System.out.println("Escolha qual conta");
        Byte op = scanner.nextByte();
        System.out.println(op);


    }
    
}