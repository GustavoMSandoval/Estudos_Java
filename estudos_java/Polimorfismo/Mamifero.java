public class Mamifero extends Animal {
    protected String tipo;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
 
    @Override
    public void locomover() 
    {
        System.out.println("movendo");
    } 

    @Override
    public void alimentar() 
    {
        System.out.println("comendo");
    }
   
    @Override
    public void emitirSom() 
    {
        System.out.println("correndo");
    }

}
