import java.io.*;
public class hello1 {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("./Krishna.txt",true);
        BufferedWriter bf=new BufferedWriter(fw);
        bf.write("Computer\nis a fancy\nworld");
        bf.close();
    }
}
