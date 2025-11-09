package Oops;

class Person{
    String name;

    Person(String name){
        this.name=name;
        System.out.println("Person Constructor:"+name);
    }
}

class Studen extends Person{
    int rollNo;

    Studen (String name,int rollNo){
        super(name);
        this.rollNo=rollNo;
        System.out.println("Student constructor , roll no:"+rollNo);
    }
}

public class ConsInheritans {
    public static void main(String[] args) {
        Studen s=new Studen("Lalit",101);
    }
}
