package advance.Lambda;

import java.util.function.BinaryOperator;

public class BinaryMe {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (a, b) -> a + b;

        System.out.println(sum.apply(5, 10)); // 15
    }
}
