import java.io.*;
import java.util.*;
import java.util.regex.*;

public class inputFile 
{
    public static void main (String args[]) throws IOException
    {
        // String to be scanned to find the pattern. 
        BufferedReader input1 = new BufferedReader (new FileReader ("input.txt"));
        BufferedWriter output1 = new BufferedWriter (new FileWriter("output.txt"));
        String data1;
        
        while ((data1  = input1.readLine ()) != null) 
        {
            
            String[] data2 = data1.split("");
            // Create a Pattern object 
            String pattern1 = "(([A-Za-z]+),(( [A-Z].)+))"; 
            Pattern rowPattern1 = Pattern.compile (pattern1); 
            
            //Create matcher object. 
            Matcher matcher1 = rowPattern1.matcher (data1); 
           
            if (matcher1.find ())  
            { 
                String fullName = matcher1.group (1);
                String firstName = matcher1.group (2);
                String lastName = matcher1.group (3);
                // String dataString = data1.replaceAll("[.,(,)]", "").replaceAll("[?]", "?.");
                
                // Pattern rowPattern2 = Pattern.compile(fullName);
                
                // swapping name
                String tempName = firstName;
                firstName = lastName + " ";
                lastName = tempName;
                fullName = firstName + lastName;
                System.out.println("data : " + fullName + data1);
                
                // System.out.println("matcher : " + matcher2.lookingAt());
                // System.out.println("data type : " + matcher1.getClass().getName());


                output1.newLine();
                output1.write (data1);
            }  
            
            else  
            { 
                System.out.println ("NO MATCH"); 
            } 

            // System.out.println(data1);
        }

        input1.close();
        output1.close();
    }
}
