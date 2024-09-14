package pack1;
import pack2.Student;
public class Import {
    public static void main(String krishna[]){
        Student s1=new Student();
        s1.setRoll(100);
        s1.setName("Hari NArayan");
        System.out.println("Roll: "+s1.showRoll());
        System.out.println("Name: "+s1.showName());
    }
}
