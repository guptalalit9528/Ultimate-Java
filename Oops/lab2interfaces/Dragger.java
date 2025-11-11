package Oops.lab2interfaces;

public class Dragger {
    public void drag(UIWidget draggerable) {
        draggerable.drag();
        System.out.println("Dragging done!");
    }
}
