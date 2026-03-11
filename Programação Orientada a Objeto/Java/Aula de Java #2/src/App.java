
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // declarando uma variavel com um valor inicializado
        int idade = 20;

        //entrada de dados
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu RA: ");
        int ra = sc.nextInt();

        // saida de dados
        System.out.println(nome);
        System.out.println(ra);
        System.out.println(idade);

        //
    }
}
