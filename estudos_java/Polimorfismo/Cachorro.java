

public class Cachorro extends Mamifero {
    protected String abanar;

    @Override
    public void emitirSom() {
        System.out.println("Latir");
        
    }

    void latir() 
    {
        System.out.println("latir");
    }

    void reagir(String frase) 
    {
        
        if(frase == "oi")
        {
            latir();
        } else {
            System.out.println("rosnar");
        }
    }
    void reagir(int hora , int min) 
    {
        if(hora < 18) 
        {
           latir();
        } else if (hora >= 18) 
        {
            System.out.println("ignorar");
        }
    }
    void reagir(int idade, float peso) 
    {
        if(idade <= 12 && peso <= 40)
        {
            latir();
        } else {
            System.out.println("rosnar");
        }
    }


}
