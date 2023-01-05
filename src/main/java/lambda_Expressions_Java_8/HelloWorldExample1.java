package lambda_Expressions_Java_8;

public class HelloWorldExample1 implements HelloWorldInterface {

    /**
     * We can use default override
     */
    @Override
    public String sayHelloWorld() {
        return "Default override";
    }

    public static void main(String[] args) {

        HelloWorldExample1 test = new HelloWorldExample1();

        // generate custom Override for this Link
        HelloWorldInterface test2 = () -> "Override using Lambda_ONE";
        // generate custom Override for this Link
        HelloWorldInterface test3 = () -> "Override using Lambda_TWO";

        System.out.println(test.sayHelloWorld());
        System.out.println(test2.sayHelloWorld());
        System.out.println(test3.sayHelloWorld());
    }
}
