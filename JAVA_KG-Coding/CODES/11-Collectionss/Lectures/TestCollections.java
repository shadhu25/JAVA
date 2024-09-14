package _12Collectionss.Lectures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<>();
        numList.add(3);
        numList.add(-93);
        numList.add(73);
        numList.add(35);
        numList.add(33);
        Utility.print(numList);
        Collections.sort(numList);
        Utility.print(numList);
        Collections.reverse(numList);
        Utility.print(numList);
        List<Integer> unmodifiable=Collections.unmodifiableList(numList);
        unmodifiable.add(66);
    }
}
