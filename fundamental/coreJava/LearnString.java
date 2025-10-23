package coreJava;

import java.util.Locale;

public class LearnString{
    public static void main(String[] args) {
        String message= "Hello Java";
        String message2="hello ";
        int number=3;
        System.out.println(message.toString());
        System.out.println(message.length());
        System.out.println(message.getBytes());
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.charAt(4));
        System.out.println(message.chars());
        System.out.println(message.isEmpty());
        System.out.println(message.compareToIgnoreCase (message2));
        System.out.println(message.compareTo(message2));
        System.out.println(message.concat(" World"));
        System.out.println(message.contains("va"));
        System.out.println(message.startsWith("H"));
        System.out.println(message.endsWith("st"));
        System.out.println(message.equals("hi"));
        System.out.println(message.indexOf("e"));
        System.out.println(message.lastIndexOf("an"));
        System.out.println(message.substring(2));
        System.out.println(message.substring(1, 4));
        System.out.println(message.replace('a', 'o'));
        System.out.println("l,a,l,i,t".split(","));
        System.out.println(message.trim());
        System.out.println(message.intern() == "He");













    }
}
