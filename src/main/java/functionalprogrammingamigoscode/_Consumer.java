package functionalprogrammingamigoscode;

import java.util.List;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        List<Customer> listCustomer = List.of(
                new Customer("John", "111"),
                new Customer("Maria", "222"),
                new Customer("Aisha", "333"),
                new Customer("Max", "444"),
                new Customer("Aren", "555"),
                new Customer("Alice", "666")
        );

        for (Customer e : listCustomer) {
            System.out.println("imperative/////");
            greetCustomer(e);
            System.out.println("declarative/////");
            consumerFunction.accept(e);
        }

    }

    static Consumer<Customer> consumerFunction = _Consumer::greetCustomer;

    static void greetCustomer(Customer customer) {
        System.out.println(customer.toString());
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }
}
