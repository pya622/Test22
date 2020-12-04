package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        StartGame startGame = new StartGame(scanner); // 게임시작


        while(startGame.isCheckedGame()) {
            startGame.play();

        }
    }
}