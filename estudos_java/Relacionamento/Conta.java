public class Conta {
    private String nome;
    private String tipoConta;
    private double saldo;
    private boolean contaExiste;


    //------Constructor-----
    public Conta(String nome,String tipoConta , double saldo,boolean contaExiste)  
    {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.contaExiste = contaExiste;
    }

    //------Getters-----
    public String getNome() 
    {
        return nome;
    }
    public String getTipoConta() 
    {
        return tipoConta;
    }
    public double getSaldo() 
    {
        return saldo;
    }
    public boolean getContaExiste() 
    {
        return contaExiste;
    }

    //------Setters-----

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public void setTipoConta(String tipoConta) 
    {
        this.tipoConta = tipoConta;
    }
    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }
    public void setContaExiste(boolean contaExiste) 
    {
        this.contaExiste = contaExiste;
    }

}
