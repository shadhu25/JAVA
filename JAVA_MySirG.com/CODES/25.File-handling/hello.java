import java.io.*;
public class hello{
    public static void main(String[] args)  throws IOException{
        int i;
        FileOutputStream fout=new FileOutputStream("/media/shadhu/94986C41986C2448/studyMetarials/languageCode/JAVA/java(saurabhshukla/25.File-handling/SITA.txt",true);
        String s="TATA";
        char ch[]=s.toCharArray();
        for(i=0;i<s.length();i++)
            fout.write(ch[i]);
        fout.close();
    }
}