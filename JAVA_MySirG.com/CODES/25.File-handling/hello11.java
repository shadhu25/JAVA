import java.io.*;
public class hello11 {
    public static void main(String[] args) throws IOException{
        int i;
        FileReader fr=new FileReader("/media/shadhu/94986C41986C2448/studyMetarials/languageCode/JAVA/java(saurabhshukla/25.File-handling/Krishna.txt");
        BufferedReader bf=new BufferedReader(fr);
        while((i=bf.read())!=-1)
            System.out.print((char)i);
        bf.close();
    }
}
