package optional;

import java.util.Optional;

public class OptionalTwo {
    public static void main(String[] args) {
        //
        Optional<String> str = Optional.of("HW");
        System.out.println("HW");
        System.out.println(getWords());
    }

    public static Optional<String> getWords() {
        String[] words = new String[10];
        Optional<String> optional = Optional.ofNullable(words[1]);
        if (optional.isPresent()) return optional;
        else return Optional.empty();
    }
}
