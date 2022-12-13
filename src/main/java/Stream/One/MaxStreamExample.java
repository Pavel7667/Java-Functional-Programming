package Stream.One;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxStreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);

        int min2 = numbers.stream().reduce(0, (a, b) -> a < b ? a : b);

        System.out.println(min);
        System.out.println(min2);

    }
}
