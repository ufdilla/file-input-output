import java.io.*;
import java.util.*;
import java.util.regex.*;

public class inputFile {
    public static void main(String[] args) 
    {
        try 
        {
            File file1 = new File("input.txt");
            StringBuffer stringBuffer1;

            try (FileReader fileReader1 = new FileReader(file1)) 
            {
                BufferedReader bufferedReader = new BufferedReader(fileReader1);
                BufferedWriter output1 = new BufferedWriter(new FileWriter("output.txt", true));

                stringBuffer1 = new StringBuffer();
                String name;

                while ((name = bufferedReader.readLine()) != null) 
                {
                    stringBuffer1.append(name);
                    stringBuffer1.append("\n");
                }

                String[] a = stringBuffer1.toString().split("\n");
                for (int i = 0; i < 2; i++) 
                {
                    String kata = a[i].replaceAll("[\\.,\\(]", "").replaceAll("\\?", "\\?.").replaceAll("\\)", ". ");
                    String[] b = kata.split(" ");
                    System.out.print(b[1] + ". " + b[0] + " ");

                    for (int j = 2; j < b.length; j++) 
                    {
                        System.out.print(b[j] + " ");
                        output1.newLine();
                        output1.write(b[j]);
                    }

                    System.out.println(".");
                }

                String kata2 = a[2].replaceAll("[\\.,\\(]", "").replaceAll("\\?", "\\?.").replaceAll("\\)", ". ");
                String[] c = kata2.split(" ");
                for (int k = 0; k < 1; k++) 
                {
                    System.out.print(c[1] + " " + c[0] + " " + c[3] + " " + c[2] + " " + c[4] + " " + c[6] + " " + c[5] + "; ");
                    for (int l = 6; l < c.length; l++) 
                    {
                        System.out.print(c[l] + " ");
                        output1.newLine();
                        output1.write(c[l]);
                    }

                    System.out.println(".");
                }

                String kata3 = a[3].replaceAll("[\\.,\\(]", "").replaceAll("\\?", "\\?.").replaceAll("\\)", ". ");
                String[] d = kata3.split(" ");
                for (int m = 0; m < 1; m++) 
                {
                    System.out.print(d[1] + ". " + d[0] + " ");
                    for (int n = 2; n < d.length; n++) 
                    {
                        System.out.print(d[n] + " ");
                        output1.newLine();
                        output1.write(d[n]);
                    }

                    System.out.println(".");
                }

                output1.close();
            }
        }

        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}