public class Pokemon {
    private String nome;
    private tipoPokemon tipo;

    public Pokemon(String nome, tipoPokemon tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public tipoPokemon getTipo(){
        return tipo;
    }

    public void setTipo(tipoPokemon tipo){
        this.tipo = tipo;
    }
}
