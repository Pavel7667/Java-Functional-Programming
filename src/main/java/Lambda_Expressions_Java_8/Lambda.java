package Lambda_Expressions_Java_8;

public class Lambda {

    public static void main(String[] args) {
        HelloWorldInterface obj = () -> {
            return "hello";
        };

        HelloWorldInterface obj2 = () -> {
            return "No ";
        };
        System.out.println(obj2.sayHelloWorld());

        IncrementByNumber obj3 = (x) -> x * x;
        IncrementByNumber obj4 = (x) -> x * x;
        System.out.println(obj3.incrementByNumber(5));
        System.out.println(obj4.incrementByNumber(50));

        CalculusInterface multi = ((a, b) -> a * b);
        System.out.println(multi.calculate(5, 5));
        CalculusInterface divide = ((a, b) -> a / b);
        System.out.println(divide.calculate(5000, 5));
    }
}
