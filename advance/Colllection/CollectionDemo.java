package advance.Colllection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> colle = new ArrayList<>();

        colle.add("a");
        colle.add("b");
        colle.add("c");
        System.out.println(colle);

        Collection<String> other =new ArrayList<>();
        other.addAll(other);
        System.out.println(other == other);
        System.out.println(other.equals(other));
    }
}
