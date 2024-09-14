package _12Collectionss.Lectures;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        System.out.println(set.add("krishn"));
        System.out.println(set.add("sunil"));
        System.out.println(set.add("ram"));
        Utility.print(set);
        System.out.println(set.add("sunil"));
        System.out.println(set.size());
        Utility.print(set);
        System.out.println(set.remove("sunil"));
        Utility.print(set);
    }
}
