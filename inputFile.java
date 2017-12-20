import java.io.*;
import java.util.*;
import java.util.regex.*;

public class inputFile 
{

    public static void main(String args[]) throws IOException
    {
        // String to be scanned to find the pattern. 
        BufferedReader in = new BufferedReader( new FileReader("input.txt"));
        String data = in.readLine();
        String dataString = data.replaceAll("[.]", "").replaceAll("[?]","?.");
        
        // Create a Pattern object 
        String pattern = "(([A-Za-z]+),(( [A-Z].)+))"; 
        Pattern r = Pattern.compile(pattern); 

          // Now create matcher object. 
        Matcher m = r.matcher(dataString); 
        if (m.find())  
        { 
            System.out.println("Found value: " + m.group(1)); 
            System.out.println("Found value: " + m.group(2)); 
            System.out.println("Found value: " + m.group(3)); 
        }  
        else  
        { 
            System.out.println("NO MATCH"); 
        } 
    }
}
