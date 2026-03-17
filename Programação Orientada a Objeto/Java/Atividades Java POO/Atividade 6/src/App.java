
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero A: ");
        int a = sc.nextInt();

        System.out.println("Insira o numero B: ");
        int b = sc.nextInt();

        //primeira saida no terminal, antes dos valores se inverterem
        System.out.println("Antes da troca");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        //VARIAVEL AUXILIAR
        int auxiliar;

        //troca de valores

        auxiliar = a;
        a = b;
        b = auxiliar;

        //segunda saida com os valores invertidos

        System.out.println("depois da troca");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        sc.close();

    }
}
