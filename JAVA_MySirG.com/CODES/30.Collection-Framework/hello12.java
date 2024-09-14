import java.util.*;
public class hello12 {
    public static void main(String[] args) {
        int a[]={20,22,45,10,71};
        int l=a.length,i;
        for(i=0;i<l;i++)
            System.out.print(a[i]+"   ");
        System.out.println();
        Arrays.sort(a);
        for(i=0;i<l;i++)
            System.out.print(a[i]+"   ");
        System.out.println();
        int a1[]={20,22,45,10,71};
        Arrays.sort(a1,2,5);
        for(i=0;i<l;i++)
            System.out.print(a1[i]+"   ");
        System.out.println();
        System.out.println(Arrays.binarySearch(a,22));
        System.out.println(Arrays.binarySearch(a,2,5,22));
        System.out.println(Arrays.equals(a,a1));
        Arrays.fill(a1,2);
        for(i=0;i<l;i++)
            System.out.print(a1[i]+"   ");
        System.out.println();
        Arrays.fill(a1,2,4,5);
        for(i=0;i<l;i++)
            System.out.print(a1[i]+"   ");
        System.out.println();
    }
}
