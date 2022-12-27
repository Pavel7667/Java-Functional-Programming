package functionalprogrammingamigoscode;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(((((connectionToDB())))));

        System.out.println(getConnectionToDb.get());
    }

    static String connectionToDB() {
        return "jdbc://localhost:5432/some_db";
    }

    static Supplier<String> getConnectionToDb = () -> "jdbc://localhost:5432/some_db";
}
