package Oops.lab2interfaces;
interface DemoInterfaces {
    void sound();
    void eat();
}

class Dog implements DemoInterfaces{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
    @Override
    public void eat(){
        System.out.println("Dog eats barks");
    }
}

class Cat implements DemoInterfaces{
    @Override
    public void sound(){
        System.out.println("cat meows");
    }
    @Override
    public void eat(){
        System.out.println("Cat drink milk");
    }
}
