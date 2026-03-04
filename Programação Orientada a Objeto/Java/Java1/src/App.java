public class App {
    // todo arquivo java inicia com uma class
    public static void main(String[] args) throws Exception {
        // main: principal -> ponto de partida ou a porta de entrada para iniciar a
        // execução do projeto em java
        System.out.println("Olá Mundo POO");
        // println: exibição de uma mensagem de texto no terminal
        // ln: quebra de linha
        // comentario de uma linha

        // ALT + SHIFT + F -> Organizador de Codigo
        // CTRL + ; -> comentario

        String nome = null; //Declarando uma variavel 
        String turma = "2ADS"; //Declarando uma variavel com valor
        //iniciando uma variavel

        System.out.println(turma);
        System.out.println(nome);
        // Instancia de uma classe ou criação do objeto
        Veiculo kwid = new Veiculo();
        kwid.ano=2025;
        System.out.println(kwid.ano);

    }
}
