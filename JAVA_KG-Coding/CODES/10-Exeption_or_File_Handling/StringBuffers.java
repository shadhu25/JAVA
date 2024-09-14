package _11Exeption_or_File_Handling;

public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("krishn"); // default capacity: 16+6 new capacity: 22
        System.out.println(sb.capacity());
        StringBuffer sb1=new StringBuffer(); // default capacity: 16
        System.out.println(sb1.capacity());
        // append()
        sb1.append("krishn");// capacity is still same
        System.out.println(sb1.capacity());
        sb1.append(" kant kumar");
        System.out.println(sb1.capacity()); // if default capacity full then it will exceed by default cap*2+2: 34
        // length()
        System.out.println(sb1.length());
        // delete()
        sb1.delete(7,11);
        System.out.println(sb1);
        // deleteCharAt()
        sb1.deleteCharAt(4);
        System.out.println(sb1);
        // equals() it will check  on only reference not actual values
        System.out.println(sb.equals(sb1));
        // indexOf()
        System.out.println(sb1.indexOf("i"));
        // lastIndexOf()
        System.out.println(sb1.lastIndexOf("k"));
        // insert()
        System.out.println(sb1.insert(6,"kant"));
        // replace()
        System.out.println(sb1.replace(4,4,"h"));
        // reverse()
        System.out.println(sb1.reverse());
        // subSequence()
        System.out.println(sb1.subSequence(5,9));
        // substring()
        System.out.println(sb1.substring(5));
        System.out.println(sb1.substring(5,9));
        // toString()
        String s=sb1.toString();
        System.out.println(s);
        // ensureCapacity()
        sb1.ensureCapacity(100);
        System.out.println(sb1.capacity());
        // setChatAt()
        sb1.setCharAt(4,'x');
        System.out.println(sb1);
        // setLength()
        sb1.setLength(10);
        System.out.println(sb1);
        // trimToSize()
        System.out.println(sb1.capacity());
        sb1.trimToSize();
        System.out.println(sb1.capacity());
    }
}
