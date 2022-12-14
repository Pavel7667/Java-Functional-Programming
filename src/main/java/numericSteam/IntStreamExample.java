package numericSteam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {

        // Converting Stream of PRIMITIVE to List<Integers>
        List<Integer> numbers;
        IntStream numStream = IntStream.rangeClosed(1, 500);
        numbers = numStream.boxed().collect(Collectors.toList());

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .reduce(1, (a, b) -> (a * 3) * (b * 2));

        System.out.println(sum);
    }
}
