package parallelStream;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

public class ParallelOne {
    public static void main(String[] args) {
        System.out.println("Some time " + LocalDateTime.now());

        LocalDateTime dS = LocalDateTime.now();
        System.out.println("Default stream  " + sumSequentialStream());
        LocalDateTime dF = LocalDateTime.now();
        System.out.println(dS.getNano() - dF.getNano());
        LocalDateTime dS1 = LocalDateTime.now();
        System.out.println("Default stream      " + parallelSumSequentialStream());
        LocalDateTime dF2 = LocalDateTime.now();
        System.out.println(dS1.getNano() - dF2.getNano());
        //

    }


    public static int sumSequentialStream() {
        return IntStream.rangeClosed(0, 500000000).sum();
    }

    public static int parallelSumSequentialStream() {
        return IntStream.rangeClosed(0, 500000000).parallel().sum();
    }

}
