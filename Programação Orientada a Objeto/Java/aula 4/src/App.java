
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        //chamando um metodo para executar
        //estruturaCondicional();

        // metodoSemRetorno();
        // String res = metodoComRetorno();
        // // String res = metodoSemRetorno(); -> não é possivel realizar essa operação
        // System.out.println(res);
        // //ou
        // System.out.println(metodoComRetorno());
        // // System.out.println(metodoSemRetorno()); --> nao é possivel realizar essa operação
        // System.out.println("ok: " + metodoComRetorno());
        // System.out.println("Hoje é" + " quarta-feira");
        // //concatenar = juntar texto . é utilizado o simbolo +
        // somar(10, 10);
        // System.out.println(subtrair(10, 5));
        calculadora c1 = new calculadora();
        c1.soma(10, 10);

    }

    //exemplos de metodos em Java
    public static void metodoSemRetorno() {
        System.out.println("esse metodo nao possui retorno");
        //metodo sem retorno é utilizado a palavra reservada "void"
    }

    public static String metodoComRetorno() {
        return "esse metodo possui um retorno de tipo String";
        //metodo com retorno é obrigatorio utilizar a palavra "return"
    }

    public static void somar(float n1, float n2) {
        float res = n1 + n2;
        System.out.println(res);
    }

    public static float subtrair(float n1, float n2) {
        return n1 - n2;
    }

    public static void estruturaCondicional() {
        //public void estruturaCondicional() -> Assinatura do metodo
        //nivelAcesso tipoRetorno nomeMetodo (parametroEntrada)
        //() -> metodo nao tem parametros, ou seja, nao permiti entrada de dados
        //void -> ele não tem uma saida

        //estrutura condicional
        //scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        //codicação simples (if)
        if (idade > 18) {
            System.out.println("Maior de idade");
        }

        //codicação simples (if- elseif - else)
        if (idade > 10) {
            System.out.println("Criança");
        } else if (idade > 10 && idade < 18) {
            System.out.println("Adolecente");
        } else if (idade > 18 && idade < 65) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        //operadores de comparação >, <, >= , <=, ==
        //operadores logicos: && (logica AND), 
        //multiplos casos
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("dia invalido");
                break;
        }

        //ternario (simplificação da estrutura composta)
        //? ->  é o mesmo q o if : -> é o mesmo q o else 
        float nota = sc.nextFloat();

        String resultado;
        if (nota >= 6) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        //exemplo de ternário
        resultado = (nota >= 6) ? "aprovado" : "reprovado";
        System.out.println("A sua situação é:" + resultado);

    }
}
