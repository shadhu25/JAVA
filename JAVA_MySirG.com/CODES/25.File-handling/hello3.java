import java.io.*;
public class hello3 {
    public static void main(String[] args) throws IOException {
        int i=0;
        FileInputStream fin=new FileInputStream("/media/shadhu/94986C41986C2448/studyMetarials/languageCode/JAVA/java(saurabhshukla/25.File-handling/SITA.txt");
        while(i!=-1){
            i=fin.read();
            if(i!=-1)
            System.out.print((char)i);
        }
        System.out.print("\n");
        fin.close();
    }
}
