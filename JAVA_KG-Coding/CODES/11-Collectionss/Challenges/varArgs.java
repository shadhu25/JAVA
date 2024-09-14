package _12Collectionss.Challenges;

public class varArgs {
    public  static String concat(String... string){
        StringBuilder str=new StringBuilder();
        for (String string1:string)
            str.append(string1).append(" ");
        return str.substring(0,str.length()); // return str.toString();
    }
    public static void main(String[] args) {
        String str=concat("I","am","Krishn","Kant","Kumar");
        System.out.println(str);
    }
}
