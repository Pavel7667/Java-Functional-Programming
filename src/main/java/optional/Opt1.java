package optional;

import java.util.Optional;

public class Opt1 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
//        int number = numbers[1].intValue();
//        System.out.println(number);  // is null
        Optional<Integer> isOpt = Optional.ofNullable(numbers[1]);
        int result = isOpt.isPresent() ? isOpt.get() : -1;
    }
}
