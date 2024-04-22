public class PlayerElite {
    
    private String classe;
    private int defesa;
    private int ataque;
    
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public PlayerElite(String classe, int defesa, int ataque) {
        this.classe = classe;
        this.defesa = defesa;
        this.ataque = ataque;
    }

    public PlayerElite() {
    }


    @Override
    public String toString() {
        return super.toString() + "\nclasse=" + classe + ", defesa=" + defesa + ", ataque=" + ataque + "]";
    }

    
    

}
