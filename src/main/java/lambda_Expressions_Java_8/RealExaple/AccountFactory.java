package lambda_Expressions_Java_8.RealExaple;

@FunctionalInterface
public interface AccountFactory {
    public abstract BankAccount getBankAccount(int id, double balance,
                                               String accountName);
}
