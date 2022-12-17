package RPG;

public class Mage extends Hero {
    private int potion;
    private int capeMagique;

    public Mage(String name, int pv, int degat, int mana, int capeMagique) {
        super(name, pv, degat, mana);
        this.potion = potion;
        this.capeMagique = capeMagique;
    }

    public int getPotion() {
        return potion;
    }

    public int getCapeMagique() {
        return capeMagique;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }

    public void setCapeMagique(int capeMagique) {
        this.capeMagique = capeMagique;
    }
}
