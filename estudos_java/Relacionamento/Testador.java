public class Testador {
    public static void main(String[] args) {
        gerenciadorBanco g1 = new gerenciadorBanco("Gus", "cc", 50, true);
        gerenciadorBanco g2 = new gerenciadorBanco("lu", "cp", 10, true);
        g1.setDepositar(10);
        g1.depositado();
        g1.status();
        g1.setTransferencia(g2, g1, 100);
        g1.transferir();
        g1.status();

}
}
