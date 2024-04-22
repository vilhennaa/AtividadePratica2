public class Npc extends Personagem{
    
    private String profissao;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Npc(String profissao) {
        this.profissao = profissao;
    }

    public Npc() {
    }

    @Override
    public String toString() {
        return super.toString() + "Npc profissao = " + profissao + "]";
    }
    
}
