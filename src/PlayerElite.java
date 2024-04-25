public class PlayerElite extends Personagem {
    
    private String classe;
    private int ataque;
    
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public PlayerElite(String nome, int idade, int vida, String falaPersonagem, String classe, int ataque) {
        super(nome, idade, vida, falaPersonagem);
        this.classe = classe;
        this.ataque = ataque;
    }

    public PlayerElite() {
    }


    @Override
    public String toString() {
        return super.toString() + "\nClasse: " + classe + "\nAtaque: " + ataque;
    }

}
