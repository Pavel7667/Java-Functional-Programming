package Stream.One;

import java.util.Arrays;
import java.util.List;

public class SkipLimitExample {
    public static void main(String[] args) {


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> limit = integers.stream().limit(5).toList(); // = first 5
        List<Integer> skip = integers.stream().skip(5).toList(); // = after 5
    }
}
