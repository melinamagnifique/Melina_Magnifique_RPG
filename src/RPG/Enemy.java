package RPG;

public class Enemy extends Combatant {
    private String name;
    public Enemy(int degat, int pvmax, String name) {
        super(pvmax, degat);
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

