package numericSteam;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ExampleMapToObject {
    public static void main(String[] args) {
        List<RandomIDS> randomIDSList = IntStream.rangeClosed(1, 5)
                .mapToObj((i) -> {
                    return new RandomIDS(i,
                            ThreadLocalRandom.current().nextInt(90));
                }).toList();

        randomIDSList.forEach(System.out::println);

        List<Double> d = List.of(new Double[]{1.0, 2.0, 3.0, 5.0, 6.0, 7.0, 8.0});
        DoubleStream doubleStream =
                LongStream.rangeClosed(0, d.size()).mapToDouble(i -> (double) i);
        doubleStream.forEach(System.out::println);
    }
}

class RandomIDS {
    int id;
    int randomNum;

    public RandomIDS(int id, int randomNum) {
        this.id = id;
        this.randomNum = randomNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }

    @Override
    public String toString() {
        return "RandomIDS{" +
                "id=" + id +
                ", randomNum=" + randomNum +
                '}';
    }
}

