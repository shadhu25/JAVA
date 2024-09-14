import java.io.File;
import java.io.IOException;
public class hello33 {
    public static void main(String[] args) throws IOException { 
        File f1=new File("/media/shadhu/94986C41986C2448/studyMetarials/languageCode/JAVA/java(saurabhshukla/25.File-handling/RAM.txt");
        f1.createNewFile();
        System.out.println("Is the file exist: "+f1.exists());
        System.out.println("can we write: "+f1.canWrite());
        System.out.println("can we read: "+f1.canRead());
        System.out.println("File name: "+f1.getName());
        System.out.println("File length: "+f1.length());
    }
}
