import java.io.*;
public class hello13 {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("/media/shadhu/94986C41986C2448/studyMetarials/languageCode/JAVA/java(saurabhshukla/25.File-handling/Krishna.txt");
        BufferedReader bf=new BufferedReader(fr);
        char s[]=new char[20];
        bf.read(s,0,10);
        System.out.print(s);
        bf.close();
    }
}
