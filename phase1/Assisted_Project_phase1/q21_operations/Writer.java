package q21_operations;

import java.io.File;
import java.io.FileWriter;

public class Writer {

  public static void main(String args[]) {

    String data = "This is the data in the output file";
    
    try {
      // Step 1: Creates a Writer using FileWriter
      FileWriter output = new FileWriter("C:\\Users\\Jayesh\\Desktop\\program\\Text1.txt");
      
      // Step 2: Writes string to the file
      output.write(data);
      System.out.println("Data is written to the file.");

      // Step 3: Closes the writer
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
 }
}