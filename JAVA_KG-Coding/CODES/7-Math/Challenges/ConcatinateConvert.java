package _8Math.Challenges;

public class ConcatinateConvert {
    public static void main(String[] args) {
        String firstName="Krishn Kant";
        String lastName="Kumar";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        fullName=firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}
