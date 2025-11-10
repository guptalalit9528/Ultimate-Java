package Oops;
class Gopal{
    String name;
    String ame;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getAme(){
        return ame;
    }
    public void setAme(String ame){
        name=ame;
    }
}
public class StackHeapUseGC {
    public static void main(String[] args) {
       //StackHeapUseGC s4=new StackHeapUseGC();
       // int age = 9;
       // System.out.println(age);
       Gopal s1=new Gopal();
        s1.setName("lalit");
        System.out.println(s1.getName());
        Gopal s2=new Gopal();
        s2.setAme("Mayank");
        System.out.println(s2.getName());

        s1=s2;
        System.out.println(s1.getName());

    }


}
