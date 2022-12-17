package RPG;

public abstract class Combatant {

    private int pv,pvmax,degat;

    public Combatant(int pvmax, int degat) {
        this.pvmax = pvmax;
        this.pv = pvmax;
        this.degat = degat;
    }

    public int getPv() {
        return pv;
    }

    public int getPvmax() {
        return pvmax;
    }

    public int getDegat() {
        return degat;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void setPvmax(int pvmax) {
        this.pvmax = pvmax;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }

}