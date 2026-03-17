
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //entrada de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("insira as horas: ");
        double horas = sc.nextDouble();

        //conversão para minutos e segundos
        double minutos = (horas * 60);

        //saida de dados
        System.out.println("A conversão desse horario em minutos fica " + minutos);

        sc.close();
    }
}
