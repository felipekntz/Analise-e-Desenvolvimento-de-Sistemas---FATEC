
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) throws Exception {
        
        //entrada de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu salário: ");
        double salario = sc.nextDouble();

        //calculo salario
        double aumento = 0.15;
        double resultado = salario + (salario * aumento);

        System.out.println("Seu aumento de salário ficara " + resultado);

        sc.close();
    }
}
