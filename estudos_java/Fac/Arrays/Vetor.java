import java.util.ArrayList;
import java.util.Scanner;
public class Vetor {

    public static void main(String[] args) {
        
    String[] lista = new String[10];
    ArrayList<String> stringa = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);
    
    while (stringa.size()<=4) {
        
    
    String op = scanner.nextLine();
    stringa.add(op);

    }
    lista[0] = String.valueOf(stringa);
    System.out.println(lista);
}
}
