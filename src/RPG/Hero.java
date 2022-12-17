package RPG;

public class Hero extends Combatant {

    private String classe;
    private int mana, manaMax;

    public Hero(String classe, int pvmax, int degat, int mana){
        super(pvmax,degat);
        this.classe = classe;
        this.mana = manaMax;
        this.manaMax = manaMax;
    }

    public String getClasse() {
        return classe;
    }

    public int getMana() {
        return mana;
    }

    public int getManaMax() {
        return manaMax;
    }

public int getPvmax() {
    return super.getPvmax();
}


    public void setmana(int mana) {
        this.mana = mana;
    }

    public void setStaminaMax(int staminaMax) {
        this.manaMax = manaMax;
    }
}
