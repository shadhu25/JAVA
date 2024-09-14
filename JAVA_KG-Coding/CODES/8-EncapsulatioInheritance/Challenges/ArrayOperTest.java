package _9EncapsulatioInheritance.Challenges;

public class ArrayOperTest {
    public static void main(String[] args) {
        ArrayOperations arr=new ArrayOperations(new int[]{4,4,4,4,4});
        double mean = ArrayOperations.Statistics.mean(arr.getArr());
        System.out.println("Mean: "+mean);
    }

}
