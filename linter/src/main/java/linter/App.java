/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        linterSemiColon("src/main/resources/gates.js");
    }
    
    public static void linterSemiColon(String path) {
        try {
            // get file to scan
            Scanner fileForLinter = new Scanner(new File(path));
            // start counter for amount of lines in file
            int lineCounter = 0;
            // while a token is still present,
            while (fileForLinter.hasNextLine()) {
                lineCounter++;
//              System.out.println("Line " + lineCounter + ": " + fileForLinter.nextLine());
                String currentLine = fileForLinter.nextLine();
                if (!currentLine.equals("") && !currentLine.contains("//") && !currentLine.contains("if") && !currentLine.contains("else") && !currentLine.contains("{") && !currentLine.contains("}") && !currentLine.contains(";")) {
                    System.out.println("Line " + lineCounter + " : Missing semicolon.");
                }
                // throw errors for lines that don't contain semicolon except:
                // if line is empty
                // if line ends with {
                // if line ends with }
                // if line contains if or else

            }
            // throw error if file not found
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e);
        }
    }
}
