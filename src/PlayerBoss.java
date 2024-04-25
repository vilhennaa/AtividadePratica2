public class PlayerBoss extends Personagem {

    private String ataqueEspecial;
    private int danoAtaqueEspecial;

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(String ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDanoAtaqueEspecial() {
        return danoAtaqueEspecial;
    }

    public void setDanoAtaqueEspecial(int danoAtaqueEspecial) {
        this.danoAtaqueEspecial = danoAtaqueEspecial;
    }

    public PlayerBoss() {
    }

    public PlayerBoss(String nome, int idade, int vida, String falaPersonagem, String ataqueEspecial, int danoAtaqueEspecial) {
        super(nome, idade, vida, falaPersonagem);
        this.ataqueEspecial = ataqueEspecial;
        this.danoAtaqueEspecial = danoAtaqueEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAtaque especial do Boss: " + ataqueEspecial + "\nDano do ataque especial do Boss: " + danoAtaqueEspecial;
    }
}
