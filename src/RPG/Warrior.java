package RPG;

public class Warrior extends Hero {
    private int degatcoup ;
    private int frappe;
    private int bouclier;
    private int potionFrappe;

    public Warrior(int degatcoup, int frappe, int bouclier, int potionFrappe, String name, int pv, int degat,int mana){
        super(name, pv, degat, mana);
        this.degatcoup = degatcoup;
        this.frappe = frappe;
        this.potionFrappe = potionFrappe;

    }


    public int getFrappe() {
        return frappe;
    }

    public int getPotionFrappe() {
        return potionFrappe;
    }
}

