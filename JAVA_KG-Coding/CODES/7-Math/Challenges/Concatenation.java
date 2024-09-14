package _8Math.Challenges;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println("Welcome to array of strings concatenation");
        String[] str={"Rama","Sita","Krishn","Radha","Sudama","Narayan","Shankar","Mahadev","Parvati"};
        StringBuilder strB=new StringBuilder();
        for (String S : str) {
            strB.append(S).append(" ");
        }
        System.out.println(strB);
    }
}
