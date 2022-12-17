package RPG;

public class Hunter {
    private int fleche;
    private int saut;
    private int boissonFleche;
    public Hunter(int fleche, int boissonFleche){
        this.fleche = fleche;
        this.boissonFleche = boissonFleche;
    }

    public int getBoissonFleche() {
        return boissonFleche;
    }

    public int getFleche() {
        return fleche;
    }


    public void setFleche(int fleche) {
        this.fleche = fleche;
    }

    public void setBoissonFleche(int boissonFleche) {
        this.boissonFleche = boissonFleche;
    }
}
