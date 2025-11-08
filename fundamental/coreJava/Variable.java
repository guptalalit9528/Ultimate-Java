package coreJava;

public class Variable {
    public static void main(String[] args) {
        int age=30;               //change the value
        age =35;
        System.out.println(age);

        int myAge=22;              //camelCase use first letter small and next word is capital letter start
        int myRollNo=myAge;
        System.out.println("camel case:" +myRollNo);

        int num=10,num2=15;        //this is a wrong way because same line intilize
        System.out.println("ek line me declare or intilize nahi karna chaiye:"+(num+num2));

        int number=10;
        int number2=20;
        System.out.println(number+number2);

        //rules---------------------------------------------------------------------------------------------
//        int numbers=30;     //valid
//        int Numbers=80;     //valid
//        int 1numbers=52;    //invalid
//        int @value=90;      //invalid
//        int num_ers=50;     // valid
//        int $num=40;        //valid
//        int static=40;      //invalid
//        int num  ers=70;     //invalid
//        int num#ers=55;      //invalid
    }
}

