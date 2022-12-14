package lambda_Expressions_Java_8;

public class Lambda {

    public static void main(String[] args) {
        HelloWorldInterface obj = () -> {
            return "1";
        };

        HelloWorldInterface obj2 = () -> {
            return "2 ";
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

        ConcatString link = ((a, b) -> a + " " + b);
        System.out.println(link.concatString("Hello", "World"));

        // RunAble Traditional
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += i;
                }
                System.out.println("Traditional " + sum);
            }
        };
        new Thread(runnable).start();

        // RunAble New
        Runnable runnable2 = () -> {
            int sum = 0;
            for (int i = 0; i < 15; i++) {
                sum += i;
            }
            System.out.println("Lambda save 2 rows " + sum);
        };
        new Thread(runnable2).start();


        // more Lambda
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 20; i++) {
                sum += i;
            }
            System.out.println("Lambda save 3 rows " + sum);
        }).start();
    }
}
