public class gerenciadorBanco extends Conta implements InterfaceConta
{

    private double sacar;
    private double depositar;
    private Conta transferencia;
    
    public void status () 
    {
        System.out.println(getSaldo());
        
    }

    public gerenciadorBanco(String nome, String tipoConta, double saldo, boolean contaExiste) {
        super(nome, tipoConta, saldo, contaExiste);
        
    }

    //-----Getters------
    public double getSacado() 
    {
        return sacar;
    }
    public double getDepositado() 
    {
        return depositar;
    }
    public Conta getTransferencia() 
    {
        return transferencia;
    }

    //-----Setters------
    public void setSacar(double sacado) 
    {
        this.sacar= sacado;
    }
    public void setDepositar(double depositado) 
    {
        this.depositar = depositado;
    }
    public void setTransferencia(Conta transferida,Conta transferidora, double transferido) 
    {
        if(transferidora.getSaldo() >= transferido) {transferida.setSaldo(getSaldo() + transferido);
        transferidora.setSaldo(getSaldo() - transferido);}
        
    }

    //----Abstracts-----
    @Override
    public void excluirConta() {
        setContaExiste(false);
    }

    @Override
    public void criarConta() {
        setContaExiste(true);
    }

    @Override
    public void sacado() {
        setSaldo(getSaldo() - getSacado());
    }

    @Override
    public void depositado() {
        setSaldo(getSaldo() + getDepositado());
    }

    @Override
    public void transferir() {
        
    }
    
}