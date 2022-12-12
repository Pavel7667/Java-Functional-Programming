package Stream.One;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollections {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Sue");
        names.add("JO");
        names.add("Mary");

        System.out.println(names);

        names.remove("Mike");
        names.remove("JO");

        System.out.println(names);

        Stream<String> namesStream = names.stream();
        // no add or remove operation

    }
}
