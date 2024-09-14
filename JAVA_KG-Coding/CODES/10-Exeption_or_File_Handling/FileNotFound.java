package _11Exeption_or_File_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the file name: ");
        String fileName=input.next();
        try (FileReader reader=new FileReader(fileName)){
            int read=0;
            while ((read=reader.read())!=-1){
                System.out.print((char)read);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Exception: "+e.getMessage());
        }
        catch (IOException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
