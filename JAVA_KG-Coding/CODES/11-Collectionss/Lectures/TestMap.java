package _12Collectionss.Lectures;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Prashant",44);
        map.put("Krishn",43);
        map.put("Sunil",49);
        map.put("Prateek",84);
        map.put("Anjali",74);
        System.out.println("size: "+map.size());
        System.out.println(map.get("Prashant"));
        System.out.println(map);
        System.out.println(map.containsKey("Anjali"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("Prateek"));
        for (String key : map.keySet())
            System.out.printf("%S : %s \n",key,map.get(key));
        Collection<Integer> keyValues= map.values();
        System.out.println(keyValues);
    }

}
