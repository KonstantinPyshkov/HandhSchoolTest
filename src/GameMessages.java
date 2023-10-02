public class GameMessages {
    public static final String RULES_GAME = """
            Чтобы бросить игральные кости, введите 'R',
            Чтобы восполнить здоровье, введите 'E',
            Выйти из игры, введите 'X'.""";
    public static final String INTRO = "Добро пожаловать в игру\n  \"Kill the Monster\"";
    public static final String ENTER_NAME = "Введите имя игрока:";
    public static final String STARTING_POINT = "%s, приготовьтесь к сражению!";
    public static final String TO_GO = "Ходит %s.";
    public static final String DAMAGE_DONE = "%s нанёс %d урона, ";
    public static final String HEALTH_REMAINS = "у %s осталось %d здоровья.";
    public static final String YOU_WIN = "%s, вы победили!";
    public static final String GAME_OVER = "%s, вы проиграли!";
    public static final String EXIT = "Вы вышли из игры";
    public static final String ERROR = "Введенная вами команда '%s' не существует.";
    public static final String NO_LIMIT = "Исцеление невозможно. Израсходован лимит!";
    public static final String HEALTH_STATUS = """
            Здоровье восстановлено на %d
            Текущее состояние здоровья %d
            Исцеление доступно %d раз
            """;

}
