package Oops.Lab1;

abstract class Abstraction {
    abstract void draw();
}

class Circle extends Abstraction{
    @Override
    void draw() {
        System.out.println("Draw a circle");
    }
}

class Triangle extends Abstraction{
    @Override
    void draw() {
        System.out.println("Draw a triangle");
    }
}