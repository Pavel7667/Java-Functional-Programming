package functional_Java_Interface.Function;

import java.util.function.Function;

public class FuncExam {

    public static void main(String[] args) {

        Function<Integer,Double> f1 = n->Math.sqrt(n);
        System.out.println(f1.apply(64));

        Function<String,String> f2 = s -> s.toLowerCase();


        Function<String,String> f3 = s -> s.concat("    do Concat");
        System.out.println(f3.apply("SOME TXT"));

        System.out.println(f2.andThen(f3).apply("SOME TXT"));

    }
}
