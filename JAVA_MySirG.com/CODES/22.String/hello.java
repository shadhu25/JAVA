public class hello {
    public static void main(String[] args) {
     // bellow all reference variable are referencing same reference variable(s1)
        String s1="Computer";
        String s2="Computer";
        String s3="Compu"+"ter";

        String s4=new String("Computer");

        System.out.println("Result 1: "+(s1==s2)); // true
        System.out.println("Result 2: "+s1.equals(s2)); // true
        System.out.println("Result 3: "+(s1==s4)); // false
        System.out.println("Result 2: "+s1.equals(s4)); // true

        System.out.println(s1);
        String s5=s1.toUpperCase();
        System.out.println(s5);
        s5=s1.toLowerCase();
        System.out.println(s5);

        int i=s1.indexOf('m');
        System.out.println(i);
        i=s1.indexOf('m',3);
        System.out.println(i);
        i=s1.indexOf("put");
        System.out.println(i);
        i=s1.indexOf("put",2);
        System.out.println(i);

        i=s1.lastIndexOf('m');
        System.out.println(i);
        i=s1.lastIndexOf('m',3);
        System.out.println(i);
        i=s1.lastIndexOf("put");
        System.out.println(i);
        i=s1.lastIndexOf("put",2);
        System.out.println(i);

        String s6="computer";
        System.out.println("Result 1: "+s1.equals(s6)); // false
        System.out.println("Result 2: "+s1.equalsIgnoreCase(s6)); // true

        i=s1.compareTo(s6);
        if(i==0)
            System.out.println("String are same");
        else if(i>0)
            System.out.println("Opposite to dictionary order");
        else
            System.out.println("Dictionary order");
        
        s5=s1.substring(2,4);
        System.out.println(s5);
    }    
}
