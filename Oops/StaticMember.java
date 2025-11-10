package Oops;

class StaticMember {
    int rollNo;                   // instance variable (per object alag copy)
    String name;
    static String college = "ABC"; // static variable (sab objects ke liye common)

    // Constructor
    StaticMember(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Static Method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    // Instance Method
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    // Static Block
    static {
        System.out.println("Class StaticMember Loaded!");
    }

    // Static Nested Class
    static class Helper {
        static void msg() {
            System.out.println("I am static nested class");
        }
    }

    // fundamental.Main Method
    public static void main(String[] args) {
        StaticMember s1 = new StaticMember(1, "Lalit");
        StaticMember s2 = new StaticMember(2, "Raj");

        s1.display();
        s2.display();

        // Using static method to change static variable
        StaticMember.changeCollege("XYZ");

        s1.display();
        s2.display();

        // Calling static nested class method
        StaticMember.Helper.msg();
    }
}

