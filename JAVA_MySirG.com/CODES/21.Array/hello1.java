import java.util.*;

public class hello1 {
    public static void main(String[] args) {
         // int arr[][]=new int[][]; error
         // int arr[][]=new int[][4]; error
            int arr[][]=new int[4][]; // no error
            int arr1[][]=new int[5][10]; // no error

            int arr2[][]=new int[][]{{1,2,3,4,5,6,7,8,9},{9,8,7,6,5,4,3,2,1}};
            int arr3[][]={{1,2,3,4,5,6,7,8,9},{9,8,7,6,5,4,3,2,1}};

            System.out.println("arr2[0][2] = "+arr2[0][2]);
            System.out.println("arr2.length = "+arr2.length);
            System.out.println("arr2[0].length = "+arr2[0].length);
            System.out.println("arr2[1].length = "+arr2[1].length);

            int arr4[][]=new int[3][];
            arr4[0]=new int[3];
            arr4[1]=new int[4];
            arr4[2]=new int[5];
         // arr4[1][5]=77; error
            System.out.println("arr4.length = "+arr2.length);
            System.out.println("arr4[0].length = "+arr4[0].length);
            System.out.println("arr4[1].length = "+arr4[1].length);
            System.out.println("arr4[2].length = "+arr4[2].length);
         // System.out.println("arr4[1][5] = "+arr4[1][5]); error
    }
}
