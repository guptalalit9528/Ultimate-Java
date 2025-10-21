package coreJava;
import java.util.Arrays;
public class ArraDemo {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[3] = 4;
        System.out.println(Arrays.toString(numbers));


        System.out.println("----------------------------------------------------------------------------------------");
        int[] number={5,4,9,1,5,6};
        System.out.println(number.length);
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.binarySearch(number,9));

    }
}
