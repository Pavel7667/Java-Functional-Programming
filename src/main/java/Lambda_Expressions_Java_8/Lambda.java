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
    }
}
