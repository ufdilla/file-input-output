import java.io.*;
import java.util.*;
import java.util.regex.*;

public class inputFile {

    public static void main(String args[]) {
         // String to be scanned to find the pattern. 
        String line = "Abunadi, I. (2013). Influence of Culture on e-Government Acceptance in Saudi Arabia. arXiv preprint arXiv:1307.7141."; 
        String pattern = "(([A-Za-z]+),(( [A-Z].)+))"; 
         
        // Create a Pattern object 
        Pattern r = Pattern.compile(pattern); 

          // Now create matcher object. 
        Matcher m = r.matcher(line); 
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