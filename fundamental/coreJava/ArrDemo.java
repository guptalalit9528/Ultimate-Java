package coreJava;

public class ArrDemo {
    public static void main(String[] args) {
  //      int[] myArr=new int[5];
//        myArr[0]=23;
//        myArr[1]=21;
//        myArr[2]=0;
//        myArr[3]=8;
//        myArr[4]=9;
        int[] myArr={21,34,54,65,76,78};
       // int index=3;

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
        int index =0;
        while(index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }
    }

}
