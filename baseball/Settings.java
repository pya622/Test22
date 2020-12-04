package baseball;

import 객체지향.utills.Condition;
import 객체지향.utills.RandomUtils;
import 객체지향.utills.Validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Settings { //유저가 뽑은 번호 생성
    public Numbers createdUserNumber(String input) {

        Validator.checkValidNumber(input);

        List<Integer> user = Arrays.stream(input.split("")).map(Integer::parseInt).collect(Collectors.toList());
        return new Numbers(user);
    }

    public Numbers createdComputerNumbers(){

        List<Integer> computer = new ArrayList<>();

        while(computer.size() < Condition.DEPTH) {
            int rand = getRandomNumber();
            if(computer.contains(rand)) {
                continue;
            }
            computer.add(rand);
        }

        return new Numbers(computer);



    }

    public static int getRandomNumber() {
        return RandomUtils.nextInt(Condition.MIN_VALUE, Condition.MAX_VALUE);



    }


}
