public  class Aluno extends Pessoa {
    private String curso;
    private Professor aula;

    void pagarMensalidade() 
    {
        System.out.println("paga 10");
    }


    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Professor getAula() {
        return aula;
    }
    public void setAula(Professor aula) {
        this.aula = aula;
    }
}
