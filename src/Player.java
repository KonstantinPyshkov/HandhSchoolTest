public class Player extends Creature
        implements RestoreHealth {

    private final int maxHealth;
    private static final double HEALTH_VOLUME = 0.3;
    private int countHealing;


    public Player(String playerName, int countHealing)
    {
        super(playerName);
        maxHealth = super.getHealthPoints();
        this.countHealing = countHealing;
    }

    public void restoreHealth()
    {
        if (countHealing > 0)
        {
            double hp = Math.round(maxHealth * HEALTH_VOLUME);
            setHealthPoints(getHealthPoints() + (int) hp);
            countHealing--;
            System.out.printf(GameMessages.HEALTH_STATUS, (int) hp, getHealthPoints(), countHealing);
        } else
        {
            System.out.println(GameMessages.NO_LIMIT);
        }
    }

}
