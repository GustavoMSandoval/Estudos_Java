public class testaLuta {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty boy","Franca",31,175,79.9f,11,2,1);
        l[0].ganharLuta();
        

        l[1] = new Lutador("pedrin", "angolano", 30, 150, 71.1f, 10, 0, 0);
        
        
        Luta UFC = new Luta();
        UFC.marcarLuta(l[1], l[0]);
        UFC.Lutar();

        l[0].status();
        l[1].status();

    }
}
