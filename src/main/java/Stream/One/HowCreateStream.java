package Stream.One;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class HowCreateStream {
    public static void main(String[] args) {

        // of
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<List<Integer>> test1 = Stream.of(integers);
        Stream<Integer> test2 = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6});

        //iterate 0 = 2 = 4 = 6 = 8 =(5)
        Stream<Integer> s2 = Stream.iterate(0, i -> i + 2).limit(5);
        s2.forEach(System.out::println);

        //generate (5) random number
        Stream<Integer> s3 = Stream.generate(new Random()::nextInt).limit(5);
        s3.forEach(System.out::println);
    }
}
