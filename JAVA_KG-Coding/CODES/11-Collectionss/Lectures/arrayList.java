package _12Collectionss.Lectures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<String> strList=new ArrayList<>();
        // add()
        strList.add("Krishn");
        strList.add("Radha");
        strList.add("Ram");
        strList.add("Sita");
        strList.add(2,"Sudama");
        // size()
        int size= strList.size();
        for (int i = 0; i < size; i++) {
        // get()
            System.out.print(strList.get(i)+" ");
        }
        // remove()
        strList.remove("Sudama");
        strList.remove(1);
        // set()
        strList.set(0,"Hari");
        // allows duplicates
        strList.add(0,"Hari");
        // contains()
        if(strList.contains("Ram"))
        // indexOf()
            System.out.println(strList.indexOf("Ram"));
        List<String> str=new ArrayList<>();
        str.add("anjali");
        str.add("saurabh");
        str.add("sunil");
        // addAll()
        strList.addAll(str);
        for (String s : strList) {
            System.out.print(s+" ");
        }
        System.out.println();
        strList.addAll(1,str);
        // containsAll()
        if(strList.containsAll(str))
            System.out.println("exists");
        // removeAll()
        strList.removeAll(str);
        if (strList.equals(str))
            System.out.println("equals");
        // isEmpty()
        if (!strList.isEmpty())
            System.out.println("not empty");
        // subList()
        System.out.println(strList.subList(1,4));
        strList.add("Aman");
        // Collections.sort()
        Collections.sort(strList);
        for (String s : strList) {
            System.out.print(s+" ");
        }
        strList.clear();
        for (String s : strList) {
            System.out.print(s+" ");
        }
    }
}
