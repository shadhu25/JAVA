package _11Exeption_or_File_Handling;

public class Strings {
    public static void main(String[] args) {
        String S1="krishn";
        String S2="krishn";
        if(S1==S2)
            System.out.println("Both reference are pointing to same object.");
        String S3= new String(S1);
        if(S3!=S2)
            System.out.println("Both reference are not pointing to same object.");
        // lenth()
        System.out.println("Length: "+S1.length());

        S2="     krishn    h";
        System.out.println(S2);
        // trim() replacing all extra space
        System.out.println(S2.trim());

        // for getting actual length
        System.out.println("Actual size of the String: "+S2.trim().length());
        S1=S2.trim();
        System.out.println(S1);
        // equals()
        if(S2.trim().equals(S1))
            System.out.println("Both are equal");

        S3="     ";
        System.out.println(S3.length());
        // isEmpty()
        if(S3.trim().isEmpty()) // S6.trim().length()==0
            System.out.println("String is Empty");

        if(S1.equals(S2))
            System.out.println("both are equal");
        // equalsIgnoreCase()
        S3="KRISHN";
        if(S1.equalsIgnoreCase(S3))
            System.out.println("both are equal");
        // compareTo()
        if(S1.compareTo(S2)==0)
            System.out.println("both are equal");
        // compareToIgnoreCase()
        if(S1.compareToIgnoreCase(S3)==0)
            System.out.println("both are equal");

        // using '+' for concatenation
        S1="Krishn";
        S2="kant";
        System.out.println(S1+S2);
        System.out.println(S1+10);
        System.out.println(S1+10+20);
        System.out.println(10+20+S1);
        System.out.println(10+S1+20);
        System.out.println(S1+120/10);
//      System.out.println(S1+10-20); error
        // concat()
        System.out.println(S1.concat(S2));
        // static join()
        System.out.println(String.join("&",S1,S1,S2));
        S1="I am krishn";
        // subSequence()
        System.out.println(S1.subSequence(3,7));
        // substring()
        System.out.println(S1.substring(3));
        System.out.println(S1.substring(3,7));
        S1="this is demo";
        // replace()
        System.out.println(S1.replace("is","was"));
        // replaceFirst()
        System.out.println(S1.replaceFirst("is","was"));
        // replaceAll()
        System.out.println(S1.replaceAll("is(.)","was"));
        System.out.println(S1.replaceAll("is(.*)","was"));
        // indexOf()
        System.out.println(S1.indexOf('i'));
        System.out.println(S1.indexOf(" is"));
        // lastIndexOf()
        System.out.println(S1.lastIndexOf("i"));
        // charAt()
        System.out.println(S1.charAt(5));
        // contains()
        System.out.println(S1.contains("is"));
        // startsWith()
        System.out.println(S1.startsWith("t"));
        //endsWih()
        System.out.println(S1.endsWith("y"));
        // toUpperCase()
        S1="krishn";
        System.out.println(S1.toUpperCase());
        S1="KRISHN";
        // toLowerCase()
        System.out.println(S1.toLowerCase());
        // static valueOf()
        int a=100,b=200;
        S2=String.valueOf(a);
        S1=String.valueOf(b);
        System.out.println(a+b);
        System.out.println(S1+S2);
        char[] y={'k','r','i','s','h','n',' ','k','a','n','t',' ','k','u','m','a','r'};
        S1=String.valueOf(y,0,6);
        System.out.println(S1);
        S1=String.valueOf(y,12,5);
        System.out.println(S1);
        // toCharArray()
        char[] x=S1.toCharArray();
        System.out.println(x[2]);

        System.out.println(S1);
    }
}
