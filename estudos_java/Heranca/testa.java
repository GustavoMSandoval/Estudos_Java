public class testa {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Roberto");
        Professor p1 = new Professor();
        p1.setNome("Antonio");
        a1.setAula(p1);
        a1.getAula();
        p1.setIdade(45);
        p1.FazerAniver();
        System.out.println(p1.getIdade());
        Bolsista b1 = new Bolsista();
        b1.setNome("Mattaro");
        b1.setAula(p1);
        b1.setCurso("ADS");
        b1.pagarMensalidade();
        
 
    }    
}
