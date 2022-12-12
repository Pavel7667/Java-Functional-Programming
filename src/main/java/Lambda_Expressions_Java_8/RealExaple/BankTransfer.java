package Lambda_Expressions_Java_8.RealExaple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {
    public static void main(String[] args) {

        AccountFactory accountFactory = BankAccount::new;

        BankAccount obj1 = accountFactory.getBankAccount(1, 100, "Info");
        BankAccount obj2 = accountFactory.getBankAccount(2, 200, "Good");

        BiPredicate<Double, Double> p1 = (balance, amount) -> balance > amount;
        BiConsumer<String, Double> printer = (x, y) -> System.out.println(x + y);
        BiConsumer<BankAccount, BankAccount> printer2 =
                (x, y) -> System.out.println("balance one " + x.getBalance() +
                        "\nbalance two " + y.getBalance());

        printer2.accept(obj1, obj2);


        ExecutorService service = Executors.newFixedThreadPool(10);
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "says");
            try {
                double amount = 1000;
                if (!p1.test(obj1.getBalance(), amount)) {
                    printer.accept(Thread.currentThread().getName() + "says2", amount);
                }
                while (!obj1.transfer(obj2, amount)) {
                    TimeUnit.MILLISECONDS.sleep(100);
                    continue;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
    }
}
