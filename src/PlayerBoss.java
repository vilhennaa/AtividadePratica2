public class PlayerBoss {

    private String superpoder;

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public PlayerBoss() {
    }

    public PlayerBoss(String superpoder) {
        this.superpoder = superpoder;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlayerBoss superpoder = " + superpoder + "]";
    }

    
}
