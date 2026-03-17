
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) throws Exception {

        //entrada de dados
        System.out.println("Digite Seu Nome");
        Scanner sc = new Scanner (System.in);
        String nome = sc.nextLine();

        //saida de dados
        System.out.println("Olá " + nome);
    }
}
