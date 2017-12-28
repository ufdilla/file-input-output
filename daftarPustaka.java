import java.io.*;
import java.util.*;
import java.util.regex.*;
 
public class daftarPustaka 
{
    public static void main (String args[]) throws IOException
    {
        // String to be scanned to find the pattern. 
        BufferedReader in = new BufferedReader (new FileReader ("input.txt"));
        BufferedWriter out = new BufferedWriter (new FileWriter ("output.txt"));
        String data;
        StringBuffer stringBuffer1;
        stringBuffer1 = new StringBuffer();
 
        while ((data  = in.readLine ()) != null) 
        {
            stringBuffer1.append(data);
            stringBuffer1.append("\n");
            String[] a = stringBuffer1.toString().split("\n");
            
            for (int i = 0; i < 2; i++) {
                String kata = a[i].replaceAll("\\.", "").replaceAll("\\?", "\\?.");
                String[] b = kata.split(" ");
                System.out.print(b[1] + ". " + b[0] + " ");

                for (int j = 2; j < b.length; j++) {
                    System.out.print(b[j] + " ");
                }
                System.out.println(".");
                // out.write("");
            }

            String kata2 = a[2].replaceAll("\\.", "").replaceAll("\\?", "\\?.");
            String[] c = kata2.split(" ");
            for (int k = 0; k < 1; k++) {
                System.out.print(
                        c[1] + " " + c[0] + " " + c[3] + " " + c[2] + " " + c[4] + " " + c[6] + " " + c[5] + "; ");
                for (int l = 6; l < c.length; l++) {
                    System.out.print(c[l] + " ");
                }

                System.out.println(".");
            }

            String kata3 = a[3].replaceAll("\\.", "").replaceAll("\\?", "\\?.");
            String[] d = kata3.split(" ");

            for (int m = 0; m < 1; m++) {
                System.out.print(d[1] + ". " + d[0] + " ");
                for (int n = 2; n < d.length; n++) {
                    System.out.print(d[n] + " ");
                }

                System.out.println(".");
            }
        }

        in.close();
        out.close();
    }
}
