package projeto_poo;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Projeto_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite uma frase:");
        Scanner s1 = new Scanner(System.in);
        String f = s1.nextLine();
        secundaria s = new secundaria();
        s.imprimir_frase(f);
        
    }
    
}
