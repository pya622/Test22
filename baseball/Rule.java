package baseball;

import 객체지향.utills.Condition;

public class Rule {

    public static boolean isClear = false;

    public void playGame(Numbers computerNumbers, Numbers userNumbers) {
        int ballCount = getBall(computerNumbers, userNumbers);
        int strikeCount = getStrike(computerNumbers, userNumbers);
        print(ballCount,strikeCount);
    }

    private int getStrike(Numbers computerNumbers, Numbers userNumbers) {

        return (int)userNumbers.stream().filter(n -> n==computerNumbers.get(userNumbers.indexOf(n))).count();


    }

    private int getBall(Numbers computerNumbers, Numbers userNumbers) {
        return overlap(computerNumbers,userNumbers) - getStrike(computerNumbers,userNumbers);
    }

    public int overlap(Numbers computerNumbers, Numbers userNumbers) {
        return (int)userNumbers.stream().filter(n-> computerNumbers.contains(n)).count();
    }

    public static void print(int ballCount, int strikeCount){
        if(ballCount ==0 && strikeCount == 0) {
            System.out.println("낫싱");
            return;
        }

        System.out.println(strikeCount + " 스크라이트 " + ballCount + " 볼 ");

        if(strikeCount == Condition.DEPTH) {
            isClear = true;
        }


    }
    public boolean isIsClear() {
        return isClear;
    }


}
