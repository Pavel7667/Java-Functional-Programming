package Functional_Java_Interface.MethodReference;

import java.util.function.IntConsumer;

public class MethodRef {
    static int hireScope = 10;

    public static void main(String[] args) {
        // local scope
        int anScope = 10;
        IntConsumer intConsumer = (a) -> System.out.println(hireScope * 10);
        IntConsumer ss = (a) -> System.out.println(anScope * 10);
        anScope++;


    }
}
