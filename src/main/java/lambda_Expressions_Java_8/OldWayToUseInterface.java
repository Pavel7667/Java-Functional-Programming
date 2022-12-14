package lambda_Expressions_Java_8;

public class OldWayToUseInterface implements HelloWorldInterface{
    @Override
    public String sayHelloWorld() {
        return "SOme txt";
    }

    public static void main(String[] args) {
        OldWayToUseInterface obj = new OldWayToUseInterface();
        String x = obj.sayHelloWorld();
        System.out.println(x);
    }
}
