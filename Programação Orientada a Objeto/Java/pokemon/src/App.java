
public class App {
    public static void main(String[] args) throws Exception {
        Pokemon pikachu = new Pokemon("Pikachu",tipoPokemon.RAIO);
        Pokemon squirdle = new Pokemon("Squirdle",tipoPokemon.AGUA);

        System.out.println("O "+pikachu.getNome()+" é um pokemon do tipo "+pikachu.getTipo());
    }
}
