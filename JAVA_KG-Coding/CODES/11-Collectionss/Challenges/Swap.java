package _12Collectionss.Challenges;
import java.util.List;
import java.util.Arrays;

public class Swap {
    public static void swap(List<Integer> ob,int i, int j){
        int temp=ob.get(i);
        ob.set(i, ob.get(j));
        ob.set(j,temp);
    }
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(list);
        swap(list,list.indexOf(3), list.indexOf(7));
        System.out.println(list);
    }
}
