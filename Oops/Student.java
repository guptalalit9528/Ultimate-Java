package Oops;
    class Main {
        int age;
        Main(int age) {
            this.age = age;   // yahan left "this.age" = instance variable
            // aur right "age" = local (parameter)
        }
        void show() {
            System.out.println("Age: " + age);
        }
    }

    class Student {
        public static void main(String[] args) {
            Main s1 = new Main(20);
            s1.show(); // Age: 20
        }
    }

