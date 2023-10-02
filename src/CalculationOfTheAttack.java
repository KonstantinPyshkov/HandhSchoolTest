import java.util.Random;

public class CalculationOfTheAttack {
    private static final int SUCCESSFUL_ROLL = 5;
    private static final int MIN_DAMAGE = 5;
    private static final int MIN_ROLL_THE_DICE = 1;
    private static final int MIN_VALUE_CUBE = 1;
    private static final int MAX_VALUE_CUBE = 6;
    private static final int ADDITIONAL_PROTECTION = 1;
    private static final Random RANDOM = new Random();

    public int attack(Creature attacking, Creature defending)
    {
        int modifier = attackModifier(attacking.getATTACK(), defending.getDEFENCE());
        boolean rollTheDice = rollTheDice(modifier);
        int assault = assault(rollTheDice, attacking.getDAMAGE());
        defending.setHealthPoints(defending.getHealthPoints() - assault);
        return assault;
    }

    private int attackModifier(int attack, int defence)
    {
        return Math.abs(attack - defence) + ADDITIONAL_PROTECTION;
    }

    private boolean rollTheDice(int countRoll)
    {
        if (countRoll <= 0)
        {
            countRoll = MIN_ROLL_THE_DICE;
        }
        return RANDOM
                .ints(countRoll, MIN_VALUE_CUBE, MAX_VALUE_CUBE)
                .anyMatch(x -> x >= SUCCESSFUL_ROLL);
    }

    private int assault(boolean hit, int maxDamage)
    {
        if (hit)
        {
            return RANDOM.nextInt(maxDamage) + MIN_DAMAGE;
        }
        return 0;
    }
}
