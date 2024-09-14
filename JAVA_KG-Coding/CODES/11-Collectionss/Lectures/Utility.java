package _12Collectionss.Lectures;

import java.util.Collection;

public class Utility {
    public  static <E> void print(Collection<E> x){
        System.out.print("Collection: ");
        for (E coll: x){
            System.out.printf("%s ",coll);
        }
        System.out.println();
    }
}
