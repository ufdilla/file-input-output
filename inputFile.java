import java.io.*;
import java.util.*;
import java.util.regex.*;

public class inputFile 
{

    public static void main (String args[]) throws IOException
    {
        // String to be scanned to find the pattern. 
        BufferedReader in = new BufferedReader ( new FileReader ("input.txt"));
        String data = in.readLine ();
        String dataString = data.replaceAll ("[.]", "").replaceAll ("[?]","?.");
        
        // Create a Pattern object 
        String pattern = "(([A-Za-z]+),(( [A-Z].)+))"; 
        Pattern rowPattern = Pattern.compile (pattern); 

          // Now create matcher object. 
        Matcher matcher1 = rowPattern.matcher (dataString); 
        if (matcher1.find ())  
        { 
            String fullName = matcher1.group (1);
            String firstName = matcher1.group (2);
            String lastName = matcher1.group (3);

            Pattern rowPattern2 = Pattern.compile(fullName);
            Matcher matcher2 = rowPattern2.matcher(dataString);
            dataString = matcher2.replaceAll(lastName+firstName+"; ");

            System.out.println ("Nama Pengarang: " + dataString);
        }  
        else  
        { 
            System.out.println ("NO MATCH"); 
        } 
    }
}
