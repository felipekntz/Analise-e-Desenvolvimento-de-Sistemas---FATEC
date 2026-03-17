
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) throws Exception {

        //entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        //calculo imc
        double imc = peso / (altura * altura);

        //saida
        System.out.println("Seu IMC (Índice de Massa Corpórea) é " + imc);


        sc.close();

    }
}
