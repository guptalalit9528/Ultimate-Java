package advance.Colllection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethodsUse {
    public static void main(String[] args) {
        Collection<String>coll = new ArrayList<>();
        //add(e)
        coll.add("Apple");
        coll.add("Mango");
        coll.add("Orange");
        System.out.println(coll);

        //addAll(collection c)
        Collection <String>moreFruits=new ArrayList<>();
        moreFruits.add("Cherry");
        moreFruits.add("Grapes");
        coll.addAll(moreFruits);
        System.out.println(coll);

        //contains
        System.out.println(coll.contains("Apple"));

        //contrainsAll
        System.out.println(coll.containsAll(moreFruits));

        //size
        System.out.println(coll.size());

        //isEmpty
        System.out.println(coll.isEmpty());

        //remove
        System.out.println(coll.remove("Orange"));

        //removeAll
        System.out.println(coll.removeAll(coll));

        //retain
        coll.add("mayank");
        coll.add("Gopal");
        System.out.println(coll.retainAll(moreFruits));

        //iterator()
        Collection<String> lal=new ArrayList<>();
        coll.add("Lalit");
        coll.add("La");
        coll.add("Lali");
        coll.add("L");
        Iterator<String> ma= coll.iterator();
       while(ma.hasNext()){
           System.out.println(ma.next());
       }

        //clear
        coll.clear();
        System.out.println(coll);

    }
}
