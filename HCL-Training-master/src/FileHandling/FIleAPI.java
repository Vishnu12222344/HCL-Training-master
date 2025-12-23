/*1. FILE EXISTENCE CHECKER
        Task: Create a program that checks if a file exists and displays its basic properties.
        Requirements:
        - Check if "data.txt" exists
        - If exists: print size, last modified time, and whether it's a directory
        - If not: print appropriate message
        - Use: Files.exists(), Files.size(), Files.getLastModifiedTime() */


package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FIleAPI {
    public static void main(String[] args){
        Path path= Paths.get("src/FileHandling/data.txt");

        if(Files.exists(path)){
            try{
                System.out.println("File Exists");
                System.out.println(Files.size(path));
                System.out.println(Files.getLastModifiedTime(path));
                System.out.println(Files.isDirectory(path));

            } catch (IOException e) {
                System.out.println("Error in reading file"+e.getMessage());
            }
        }else{            System.out.println("File does not exist");
        }
    }
}
