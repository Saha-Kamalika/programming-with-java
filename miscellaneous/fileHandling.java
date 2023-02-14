package classFiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling{
    public static void main(String[] args) {
        // Code to create a new file
        File myFile = new File("src");
        try {
            System.out.println("Your file is successfully created");
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        // Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("kamalika.txt");
            fileWriter.write("This is my first file from this java course");
            fileWriter.close(); //good practice
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading a file
        File mFile = new File("kamalika.txt");
        try {
            System.out.println("Reading "+ mFile.getName()+"....");
            Scanner sc = new Scanner(mFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Deleting a file
        /*File dFile = new File("kamalika.txt");
        if(dFile.delete()){
            System.out.println("I have deleted: " + dFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }*/
    }
}
