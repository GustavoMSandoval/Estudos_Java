import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

   
    void marcarLuta(Lutador desafiado,Lutador desafiante) 
    {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        
        if(this.desafiado.getCategoria().equals(this.desafiante.getCategoria() ) 
        && this.desafiado.getNome() != this.desafiante.getNome()) 
        {
            System.out.println("Luta pode ser feita \n");
            setAprovada(true);
        }
        else 
        {
            System.out.println("Luta n pode ser feita \n");
            setAprovada(false);
        }
    }
    void Lutar()
    {
        if(getAprovado() == true) 
        {
            desafiado.apresentar();
            desafiante.apresentar();
        }
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        switch (vencedor) {
            case 0:
                getDesafiado().empatarLuta();
                getDesafiante().empatarLuta();
            break;  
            case 1:
                getDesafiado().ganharLuta();
                getDesafiante().perderLuta();

            break;
            case 2:
                getDesafiado().perderLuta();
                getDesafiante().ganharLuta();
            break;
        }

    }

//---------Getters--------
    public Lutador getDesafiado() 
    {
        return desafiado;
    }
    public Lutador getDesafiante() 
    {
        return desafiante;
    }
    public int getRounds() 
    {
        return rounds;
    }
    public boolean getAprovado() 
    {
        return aprovada;
    }
   
//---------Setters--------
    public void setDesafiado(Lutador desafiado)
    {
        this.desafiado = desafiado;
    }
    public void setDesafiante(Lutador desafiante)
    {
        this.desafiante = desafiante;
    }
    public void setRounds(int rounds)
    {
        this.rounds = rounds;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
