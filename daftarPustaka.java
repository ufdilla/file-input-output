import java.io.*;
import java.util.*;
import java.util.regex.*;
 
public class daftarPustaka 
{
    public static void main (String args[]) throws IOException
    {
        // String to be scanned to find the pattern. 
        BufferedReader in = new BufferedReader (new FileReader ("input.txt"));
        BufferedWriter out = new BufferedWriter (new FileWriter("output.txt"));
        String data;
 
        while ((data  = in.readLine ()) != null) 
        {
            String dataString = data.replaceAll ("[.]", "").replaceAll ("[?]","?.").replaceAll("[(]","").replaceAll("[)]", ".");
            
            // Create a Pattern object 
            String pattern = "(([A-Za-z]+),(( [A-Z].)+))"; 
            Pattern rowPattern = Pattern.compile (pattern); 
 
            //Create matcher object. 
            Matcher matcher1 = rowPattern.matcher (dataString); 
            
            if (matcher1.find ())  
            { 
                String fullName = matcher1.group (1);
                String firstName = matcher1.group (2);
                String lastName = matcher1.group (3);
                Pattern rowPattern2 = Pattern.compile(fullName);
                Matcher matcher2 = rowPattern2.matcher(dataString);
                dataString = matcher2.replaceAll(lastName + firstName + "; ");

                System.out.println(dataString);
                out.newLine();
                ;
                out.write(dataString);
            }

            else {
                System.out.println("NO MATCH");
            }
        }

        in.close();
        out.close();
    }
}
