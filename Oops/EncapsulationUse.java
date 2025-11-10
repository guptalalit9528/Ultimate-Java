package Oops;

class Mayank{
     private String name;
    private int age;

    public String getName(){
    return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age>0){
        this.age=age;
        }else{
            System.out.println("invalid age");
        }
    }
}


public class EncapsulationUse {
    public static void main(String[] args) {
        Mayank s1=new Mayank();

        s1.setName("Lalit");
        s1.setAge(-2);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
