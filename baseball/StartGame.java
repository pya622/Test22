package baseball;

import java.util.Scanner;

public class StartGame {

    private final Scanner scanner;
    private final Settings settings;
    private final Rule rule;
    private boolean checkedGame;


    public StartGame(Scanner scanner) {
        this.scanner = scanner;
        this.rule = new Rule();
        this.settings = new Settings();
        checkedGame = true;
    }

    public boolean isCheckedGame() {
        return checkedGame;
    }


    public void play() {

        Numbers computerNumbers = settings.createdComputerNumbers();
        System.out.println(computerNumbers.toString());

        while (isCheckedGame()) {
            String str = scanner.nextLine();
            Numbers userNumbers = settings.createdUserNumber(str); // 유저 번호
            rule.playGame(computerNumbers, userNumbers);

            if (rule.isIsClear()) {
                checkedGame = false;
            }

        }

    }
}
