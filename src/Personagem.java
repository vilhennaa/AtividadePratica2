public class Personagem {
    
    private String nome;
    private int idade;
    private int vida;
    private String falaPersonagem;

    
    public Personagem() {
    }
    
    
    public Personagem(String nome, int idade, int vida, String falaPersonagem) {
        this.nome = nome;
        this.idade = idade;
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
        String text = "\nNome: " + nome + "\nIdade: " + idade + "\nVida: " + vida + "\nFala do personagem: " + falaPersonagem;
        return text;
    }
}
