import java.io.*;
import java.util.*;
import java.util.regex.*;

public class inputFile 
{
    public static void main (String args[]) throws IOException
    {
        // String to be scanned to find the pattern. 
        BufferedReader in = new BufferedReader (new FileReader ("input.txt"));
        BufferedWriter out = new BufferedWriter (new FileWriter("output.txt"));
        String data, data2;

        while ((data  = in.readLine ()) != null) 
        {
            // String dataString = data.replaceAll ("[.]", "").replaceAll ("[?]","?.").replaceAll("[(]","").replaceAll("[)]", ".");
            
            // Create a Pattern object 
            String pattern = "(([A-Za-z]+),(( [A-Z].)+))"; 
            Pattern rowPattern = Pattern.compile (pattern); 

            //Create matcher object. 
            Matcher matcher1 = rowPattern.matcher (data); 
            
            if (matcher1.find ())  
            { 
                String fullName = matcher1.group (1);
                String firstName = matcher1.group (2);
                String lastName = matcher1.group (3);

                String patternString = ".*..*";
                Pattern pattern3 = Pattern.compile(patternString);
                Matcher matcher = pattern3.matcher(data);
                boolean matches = matcher.matches();

                // Pattern rowPattern2 = Pattern.compile(fullName);
                // Matcher matcher2 = rowPattern2.matcher(data);
                // data2 = matcher2.replaceAll(lastName + " " + firstName + "; ");
                // // matches1 = Patter;
                
                // System.out.println ("full name : " + fullName);
                System.out.println(matches);
                // System.out.println("length of full name : " + fullName.length());
                System.out.println("data : " + data);
                // System.out.println("data2 : " + data2);
                // System.out.println("data type : " + fullName.getClass().getName());
                out.newLine();
                out.write (data);
            }  
            
            else  
            { 
                System.out.println ("NO MATCH"); 
            } 
        }

        in.close();
        out.close();
    }
}
