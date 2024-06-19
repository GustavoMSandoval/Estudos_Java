public abstract class Animal {
    private  float peso;
    private int idade;
    private int membros;
    private String cor;

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public int getMembros() {
        return membros;
    }
    public String getCor() {
        return cor;
    }


    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

}
