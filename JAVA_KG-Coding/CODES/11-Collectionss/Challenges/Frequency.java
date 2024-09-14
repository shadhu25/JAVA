package _12Collectionss.Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,2,4,2,2);
        System.out.println(Collections.frequency(list,2));
        System.out.println(Collections.frequency(list,4));
        System.out.println(Collections.frequency(list,1 ));
    }
}
