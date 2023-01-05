package lambda_Expressions_Java_8;


/**
 * @FunctionalInterface this mark says that this interface can have only one abstract
 * method
 */
@FunctionalInterface
public interface IncrementByNumber {

    int incrementByNumber(int number);
}
