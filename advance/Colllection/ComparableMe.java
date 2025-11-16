package advance.Colllection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableMe {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(23,41,43,2,4,7,3,90,2);

        Collections.sort(nums);
        System.out.println(nums);
    }
}
