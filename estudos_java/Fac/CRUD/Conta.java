class Conta {
    String titular;
    int num;
    float saldo;
    boolean ativo;

    public  Conta(String tit,int num , float saldo , boolean ativo)
    {
        this.titular = tit;
        this.num = num;
        this.saldo = saldo;
        this.ativo = ativo;

    }

    public  String toString() {
        return "Titular: " + titular +
                "\nNúmero: " + num +
                "\nSaldo: " + saldo +
                "\nAtivo: " + ativo;
    }


    boolean depositar(float valor)
    {
        boolean res;
        this.saldo += valor;

        return true;

    }

    boolean sacar(float valor)
    {
        this.saldo -= valor;
        return true;
    }

    boolean transferir(Conta envio,Conta destino , float valor)
    {


        if (envio.exibirSaldo() < valor) {
            System.out.println("Erro ");
            return  false;
        }
        envio.sacar(valor);
        destino.saldo = valor;

        return true;
    }

    public float exibirSaldo()
    {
        return this.saldo;
    }


}