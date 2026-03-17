
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //VARIAVEIS
        double salario = 1800.00;
        float comissao = 150;
        double comissao2 = 0.03;

        //entrada de dados
        Scanner sc = new Scanner(System.in);

        //entrada de texto (String)
        System.out.println("Insira o nome do vendedor: ");
        String nome = sc.nextLine();

        //entrada de numero inteiro (Int)
        System.out.println("Quantidade de Produtos Vendidos: ");
        int produtos = sc.nextInt();

        //entrada valor total das vendas (double)
        System.out.println("Valor total das vendas: ");
        double valor = sc.nextDouble();

        //calculo
        double resultado = salario + (comissao * produtos) + (valor * comissao2);

        //saida de dados
        System.out.println(nome + " seu salário liquido é " + resultado);

        sc.close();

    }
}
