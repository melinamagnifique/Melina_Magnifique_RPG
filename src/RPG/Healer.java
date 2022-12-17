package RPG;

public class Healer extends Hero {
    int magie;

    public Healer(String name, int pv, int degat,int mana, int magie) {
        super(name, pv, degat,mana);
        this.magie = magie;
    }

    public int getMagie() {
        return magie;
    }

    public void setMagie(int magie) {
        this.magie = magie;
    }
}
