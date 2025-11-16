package advance.Colllection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMe {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(23,41,43,2,4,7,3,90,2);

        Collections.sort(num, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 02-01; } });  //reverse order
        System.out.println(num);
    }
}
