import java.io.*;
public class hello12 {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("/media/shadhu/94986C41986C2448/studyMetarials/languageCode/JAVA/java(saurabhshukla/25.File-handling/Krishna.txt");
        BufferedReader bf=new BufferedReader(fr);
        String s=bf.readLine();
        System.out.println(s);
        s=bf.readLine();
        System.out.println(s);
        s=bf.readLine();
        System.out.println(s);
        bf.close();
    }
}
