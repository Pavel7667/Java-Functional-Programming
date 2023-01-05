package lambda_Expressions_Java_8;

public class Lambda {

    public static void main(String[] args) {
        // lambda to multiply
        IncrementByNumber obj1 = (x) -> x * x;
        // lambda for sum
        IncrementByNumber lambda = (z) -> z;
        System.out.println(obj1.incrementByNumber(5));
        System.out.println(lambda.incrementByNumber(50));

        // lambda with two parameters / action multiply
        CalculusInterface multi = ((a, b) -> a * b);
        System.out.println(multi.calculate(5, 5));
        // lambda with two parameters / action divide
        CalculusInterface divide = ((a, b) -> a / b);
        System.out.println(divide.calculate(5000, 5));

        // lambda with two parameters / action concat
        ConcatString link = ((a, b) -> a + " " + b);
        System.out.println(link.concatString("Hello", "World"));

        // RunAble in way Traditional
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

        // RunAble  in way using Lambda
        Runnable runnable2 = () -> {
            int sum = 0;
            for (int i = 0; i < 15; i++) {
                sum += i;
            }
            System.out.println("Lambda save 2 rows " + sum);
        };
        new Thread(runnable2).start(); // put Runnable object into Thread for Run


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
