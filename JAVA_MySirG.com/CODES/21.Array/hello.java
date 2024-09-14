public class hello {
    public static void main(String[] args) {
        // int arr[2]; error
        int arr[]; // not a array it is a referece variable of a array
        // int arr1[]=new int[]; error
        int arr1[]=new int[5];
        // cannot mention size or value together
        // int arr2[]=new int[4]{2,3,4,5,6,5}; error
        // int arr2[]=new int[4]{2,3,4,5}; error
        int arr2[]=new int[]{2,3,4,5,6,5};
        int arr3[]={2,3,4,5,6,5};
        // printing values
        for(int i=0;i<6;i++)
            System.out.println(arr3[i]);
    }
}
