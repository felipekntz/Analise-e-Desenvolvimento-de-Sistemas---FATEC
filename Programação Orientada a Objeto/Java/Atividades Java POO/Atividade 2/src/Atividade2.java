import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) throws Exception {

    //entrada de dados
    Scanner sc = new Scanner (System.in); 

    System.out.println("digite o primeiro numero: ");
    int n1 = sc.nextInt();

    System.out.println("digite o primeiro numero: ");
    int n2 = sc.nextInt();

    //calculos
    int soma = n1 + n2;
    int multiplicacao = n1 * n2;
    int subtracao = n1 - n2;
    int divisao = n1 / n2;

    //saida
    System.out.println("RESULTADOS");
    System.out.println("soma = " + soma);
    System.out.println("multiplicação = " + multiplicacao);
    System.out.println("subtração = " + subtracao);
    System.out.println("divisão = " + divisao);

    sc.close();

    }
}
