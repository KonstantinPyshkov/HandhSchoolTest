import java.util.Random;

public abstract class Creature {
    private final String NAME;
    private final int ATTACK;
    private final int DEFENCE;
    private int healthPoints;
    private final int DAMAGE;
    private static final Random RANDOM = new Random();

    public Creature(String name)
    {
        this.NAME = name;
        this.ATTACK = RANDOM.nextInt(30) + 1;
        this.DEFENCE = RANDOM.nextInt(30) + 1;
        this.healthPoints = RANDOM.nextInt(100) + 30;
        this.DAMAGE = RANDOM.nextInt(30) + 10;
    }

    public String getNAME() {
        return NAME;
    }

    public int getATTACK() {
        return ATTACK;
    }

    public int getDEFENCE() {
        return DEFENCE;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDAMAGE() {
        return DAMAGE;
    }

    @Override
    public String toString()
    {
        return getClass() + " {'" + NAME + '\'' +
                ", attack=" + ATTACK +
                ", defense=" + DEFENCE +
                ", health=" + healthPoints +
                ", damage=" + DAMAGE +
                '}';
    }
}
