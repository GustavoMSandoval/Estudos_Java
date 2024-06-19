public class InterfaceControle {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
      
        c.desligar();
        c.ligar();
        c.maisVolume();
        c.abrirMenu();
        c.menosVolume();
    }
}
