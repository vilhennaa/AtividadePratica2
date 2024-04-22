public class Personagem {
    
    private int idade;
    private String nome;
    private int vida;
    private String falaPersonagem;

    
    public Personagem() {
    }
    
    
    public Personagem(int idade, String nome, int vida, String falaPersonagem) {
        this.idade = idade;
        this.nome = nome;
        this.vida = vida;
        this.falaPersonagem = falaPersonagem;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public String getFalaPersonagem() {
        return falaPersonagem;
    }


    public void setFalaPersonagem(String falaPersonagem) {
        this.falaPersonagem = falaPersonagem;
    }
    
    @Override
    public String toString() {
        return "Personagem [idade=" + idade + ", nome=" + nome + ", vida=" + vida + "]";
    }




}
