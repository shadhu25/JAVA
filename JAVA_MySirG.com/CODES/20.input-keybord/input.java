import java.util.*;

public class input {
    public static void main(String[] args) {
        int pint; String sentense; String word; boolean cool; double mouble; 
        byte hyte; float jloat; long kong; short vhort; char rhar;

        Scanner maa=new Scanner(System.in);

        System.out.println("int word bool double byte float long short char sentense:-");
        pint=maa.nextInt();
        word=maa.next();
        cool=maa.nextBoolean();
        mouble=maa.nextDouble();
        hyte=maa.nextByte();
        jloat=maa.nextFloat();
        kong=maa.nextLong();
        vhort=maa.nextShort();
        rhar=maa.next().charAt(0);
        sentense=maa.nextLine();

        System.out.print("int = "+pint+"Sentence = "+sentense+"Word = "+word+"boolean = "+cool+"double = "+mouble);
        System.out.println("byte = "+hyte+"float = "+jloat+"long = "+kong+"short = "+vhort+"char = "+rhar);
    }
}
