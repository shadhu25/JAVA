package _9EncapsulatioInheritance.Challenges;

public class ArrayOperations {
    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    static class Statistics{
        public static double mean(int[] arr){
            double sum=0;
            for (int i : arr) {
                sum+=i;
            }
            return sum/arr.length;
        }
        public static double median(int[] arr){
            return 0;
        }
    }
}
