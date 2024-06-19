public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() 
    {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

//-----------Getters---------
    public int getVolume() 
    {
        return this.volume;
    }
    public boolean getLigado() 
    {
        return this.ligado;
    }
    public boolean getTocando()
    {
        return this.tocando;
    }
//-----------Setters---------
    void setVolume(int volume) 
    {
        this.volume = volume;
    }
    void setLigado (boolean ligado) 
    {
        this.ligado = ligado;
    }
    void setTocando(boolean tocando) 
    {
        this.tocando = tocando;
    }

//Métodos abstratos
    public void ligar()
    {
        setLigado(true);;
    }
    public void desligar()
    {
        setLigado(false);;
    }
    public void abrirMenu()
    {
        if(getLigado() == true){
        System.out.println("Esta ligado?" + this.getLigado());
        System.out.println("Esta tocando?" + this.getTocando());
        System.out.println("Volume:" + this.getVolume());
        for(int i = 0; i < this.getVolume(); i+=10) 
        {

            System.out.print("|");
        } 
        } else {
            System.out.println("impossível");
        }
    }
    public void fecharMenu()
    {
        if(this.ligado = true) 
        {
            System.out.println("Abri menu");
        } else {
            System.out.println("Menu não pode ser aberto");
        }
    }
    public void maisVolume()
    {
        if(getLigado() == true )
        {
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println("Impossível");
        }
    }
    public void menosVolume()
    {
        if(this.ligado == true )
        {
            this.setVolume(this.getVolume() - 1);
        } 
    }
    public void ligarMudo()
    {
        if(this.getLigado() && this.getVolume() > 0) 
        {
            this.setVolume(0);
        }
    }
    public void desligarMudo()
    {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    public void play()
    {
        if(this.getLigado() && !(this.getTocando()))
        {
            System.out.println("Tocando");
            this.setTocando(true);
        }
    }
    public void pause()
    {
        if(this.ligado == true && this.tocando == true) 
        {
            System.out.println("pausado");
            this.setTocando(false);
        }
    }




}
