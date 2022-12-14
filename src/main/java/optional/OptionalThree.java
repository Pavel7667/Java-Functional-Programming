package optional;

import java.util.Optional;

public class OptionalThree {
    public static void main(String[] args) {
        // orElse + ofNullable
        Integer[] nums = new Integer[10];
        nums[2] = 1;
        Optional<Integer> optional = Optional.ofNullable(nums[0]);
        int result = optional.orElse(-1);

        // orElseGet + ofNullable
        result = optional.orElseGet(() -> 10 * 10);

        // orElseThrow
        try {
            result = optional.orElseThrow(Exception::new);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
