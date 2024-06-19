public class ContaCorrente extends Conta{


    boolean gerarTaxa()
    {
        this.saldo -= 10.40;
        return true;
    }
}
