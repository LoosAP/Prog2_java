package ora7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args){
        try{


        File file = new File("filename.txt");
        file.createNewFile();
            if (file.createNewFile()){
                System.out.println("File created!" + file.getName());
            }
            else {
                System.out.println("File already exists");
            }
            FileWriter fw = new FileWriter("filename.txt", true);
            fw.write("Sziahelo");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hungary");
            bw.newLine();
            bw.close();
            fw.close();

            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

            if(file.delete()){
                System.out.println("File deleted: "+file.getName());
            }
            else {
                System.out.println("Failed to delete file");
            }
            }
        catch (IOException e){
            System.out.println("IO exception occurred");
            e.printStackTrace();
        }
    }
}
