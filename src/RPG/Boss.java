package RPG;

public class Boss {
    private int pvB,pvmaxB,degatB;
    private String name;

    public Boss(int pvmaxB, int degatB,String name) {
        this.name = name;
        this.pvmaxB = pvmaxB;
        this.pvB = pvmaxB;
        this.degatB = degatB;
    }

    public int getDegatB() {
        return degatB;
    }

    public void setDegatB(int degatB) {
        this.degatB = degatB;
    }

    public int getPvB() {
        return pvB;
    }

    public void setPvB(int pvB) {
        this.pvB = pvB;
    }

    public int getPvmaxB() {
        return pvmaxB;
    }

    public void setPvmaxB(int pvmaxB) {
        this.pvmaxB = pvmaxB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
