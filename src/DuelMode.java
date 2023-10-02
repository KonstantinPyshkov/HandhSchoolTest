import java.util.Scanner;

public class DuelMode {

    private static final Scanner INPUT = new Scanner(System.in);
    private final CalculationOfTheAttack atMod;

    public DuelMode(CalculationOfTheAttack atMod) {
        this.atMod = atMod;
    }

    public void duelMode()
    {
        int monsterAttack;
        System.out.printf(GameMessages.INTRO + "\n" + GameMessages.RULES_GAME + "\n" + GameMessages.ENTER_NAME + "\n");
        String namePlayer = INPUT.nextLine();
        final Player PLAYER = new Player(namePlayer, 4);
        final Monster MONSTER = new Monster("Murlocs");
        System.out.printf(GameMessages.STARTING_POINT + "\n", PLAYER.getNAME());
        boolean progressGames = true;
        while (progressGames)
        {
            System.out.printf(GameMessages.TO_GO + "\n", PLAYER.getNAME());
            String str = INPUT.nextLine().toUpperCase();
            switch (str)
            {
                case "R" ->
                {
                    int playerAttack = atMod.attack(PLAYER, MONSTER);
                    if (MONSTER.getHealthPoints() <= 0)
                    {
                        System.out.printf(GameMessages.DAMAGE_DONE + "\n" + GameMessages.YOU_WIN,
                               PLAYER.getNAME() ,playerAttack, PLAYER.getNAME());
                        progressGames = false;
                        break;
                    } else
                    {
                        System.out.printf(GameMessages.DAMAGE_DONE + GameMessages.HEALTH_REMAINS + "\n",
                               PLAYER.getNAME() ,playerAttack ,MONSTER.getNAME(), MONSTER.getHealthPoints());
                        System.out.printf(GameMessages.TO_GO, MONSTER.getNAME());
                        monsterAttack = atMod.attack(MONSTER, PLAYER);
                    } if (PLAYER.getHealthPoints() <= 0)
                    {
                        System.out.printf(GameMessages.DAMAGE_DONE + "\n" + GameMessages.GAME_OVER,
                                MONSTER.getNAME(), monsterAttack, PLAYER.getNAME());
                        progressGames = false;
                    } else
                    {
                        System.out.printf("\n" + GameMessages.DAMAGE_DONE + GameMessages.HEALTH_REMAINS + "\n",
                               MONSTER.getNAME(), monsterAttack, PLAYER.getNAME(), PLAYER.getHealthPoints());
                    }
                }
                case "E" -> PLAYER.restoreHealth();

                case "X" ->
                {
                    System.out.println(GameMessages.EXIT);
                    progressGames = false;
                }

                default -> System.out.printf(GameMessages.ERROR + "\n" + GameMessages.RULES_GAME + "\n",
                        str);
            }
        }
    }

}
