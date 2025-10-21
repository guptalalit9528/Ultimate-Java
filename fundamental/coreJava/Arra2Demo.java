package coreJava;
import java.util.Arrays;
public class Arra2Demo {
    public static void main(String[] args) {
        int[][] numbers=new int[2][3];
        numbers[0][1]=1;
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(numbers[0].length);

        System.out.println("----------------------------------------------------------------------------");

        int[][] number={{7,9},{2,3,5}};
        System.out.println(Arrays.deepToString(number));
        System.out.println(number[0].length);

        System.out.println("this is travesal------------------------------------------------------------------------------");
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
