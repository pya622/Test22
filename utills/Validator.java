package utills;

import java.util.Arrays;

public class Validator {






    public static void checkValidNumber(String input) {
        if(getInputLength(input) != input.length()) {
            throw new IllegalArgumentException(Exceptions.DO_NOT_OVERLAP); //중복된 숫자
        }

        if(input.length() != Condition.DEPTH) {
            throw new IllegalArgumentException(Exceptions.INPUT_ERROR); //1~9 초과 또는 숫자 3개 초과 입력
        }

        if(checkedZero(input) > 0) {
            throw new IllegalArgumentException(Exceptions.DO_NOT_ZERO); // 0 입력
        }



    }

    private static int checkedZero(String input) {
        return (int)Arrays.stream(input.split("")).filter(s->s.equals("0")).count();

    }

    public static int getInputLength(String input) {
        return  (int)Arrays.stream(input.split("")).distinct().count();
    }

}
