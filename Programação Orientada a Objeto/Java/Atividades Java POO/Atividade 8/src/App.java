
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //entrada
        Scanner sc = new Scanner(System.in);

        //entrada distância percorrida (km)
        System.out.println("Insira a distancia percorrida em KM: ");
        double km = sc.nextDouble();

        //entrada quantidade de combustível gasto (litros)
        System.out.println("Insira a quantidade de combustível gasto litros: ");
        double litros = sc.nextDouble();

        //calculo consumo médio do veículo (km/l)
        double kml = (km / litros);

        //saida de dados
        System.out.println("O consumo medio do seu veiculo foi de " + kml + " KM/L");

        sc.close();
    }
}
