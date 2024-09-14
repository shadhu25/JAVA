package _12Collectionss.Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {
    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if(s.equals(t1))
                    return 0;
                else if (s.charAt(0)<t1.charAt(0))
                    return 1;
                else
                    return -1;
            }
        });
    }

    public static void main(String[] args) {
        List<String> str= Arrays.asList("Bear","Zebra","Lion","Ant");
        System.out.println(str);
        sortInDescending(str);
        System.out.println(str);
    }
}
