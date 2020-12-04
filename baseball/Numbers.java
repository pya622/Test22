package baseball;

import java.util.List;
import java.util.stream.Stream;

//일급컬렉션 연습하기
public class Numbers {
    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Stream<Integer> stream() {
        return numbers.stream();
    }

    public int get(int index) {
        return numbers.get(index);
    }

    public boolean contains(int value) {
        return numbers.contains(value);
    }

    public int indexOf(int value) {
        return numbers.indexOf(value);
    }

    public String toString() {
        return numbers.toString();
    }

}
