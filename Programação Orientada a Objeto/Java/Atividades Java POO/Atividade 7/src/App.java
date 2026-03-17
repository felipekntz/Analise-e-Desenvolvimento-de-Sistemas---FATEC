
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //entrada de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero inteiro de quatro digitos: ");
        int numero = sc.nextInt();

        // para os 4 dígitos específicos (divisão "/")
        int d1 = numero / 1000;              // primeiro dígito
        int d2 = (numero / 100) % 10;        // segundo dígito
        int d3 = (numero / 10) % 10;         // terceiro dígito
        int d4 = numero % 10;                 // quarto dígito
    
        int numeroinvertido = d4 * 1000 + d3 * 100 + d2 * 10 + d1;

        //saida de dados no terminal
        System.out.println("entrada: " + numero);
        System.out.println("saida: " + numeroinvertido);

        sc.close();
    }
}
