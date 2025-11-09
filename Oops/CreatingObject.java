package Oops;

import java.util.Locale;

public class CreatingObject {

    public static void main(String[] args) {
        var text1 =new TextBox();
         text1.setText("Box 1");
           System.out.println(text1.text.toUpperCase());

        var text2=new TextBox();
        text2.setText("Box 2");
        System.out.println(text2.text);
    }
}
