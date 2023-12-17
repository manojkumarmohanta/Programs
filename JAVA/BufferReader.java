import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        try {
            // Instantiate an InputStreamReader class bypassing System.in as a parameter
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            
            // Create a BufferedReader, bypassing the above obtained InputStreamReader object as a parameter
            BufferedReader reader = new BufferedReader(inputStreamReader);
            
            // Read the first integer
            int firstInteger = Integer.parseInt(reader.readLine());
            
            // Read the second integer
            int secondInteger = Integer.parseInt(reader.readLine());
               
            System.out.println(firstInteger + " " + secondInteger);
            
            // Close the BufferedReader (optional, but good practice)
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
