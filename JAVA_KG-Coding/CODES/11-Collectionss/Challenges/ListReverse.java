package _12Collectionss.Challenges;

import java.util.Arrays;
import java.util.List;

public class ListReverse {
    public static void reverse(List<Integer> l){
        int size=l.size();
        for (int i = 0; i < size/2; i++) {
            Swap.swap(l,i,(size-1-i));
        }
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
}
