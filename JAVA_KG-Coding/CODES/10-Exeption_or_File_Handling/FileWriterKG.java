package _11Exeption_or_File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterKG {
    public static void main(String[] args) {
        String fileName="example.txt";
        try (FileWriter writer=new FileWriter(fileName)){
            writer.write("I am krishn kant kumar\n");
            for (int i = 0; i < 108; i++) {
                writer.write("\nKrishn");
            }
            writer.flush();
            System.out.println("file successfully written");
        }
        catch (IOException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
