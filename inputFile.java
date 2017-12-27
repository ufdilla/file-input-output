import java.io.*;
import java.util.*;
import java.util.regex.*;

public class inputFile {

    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            StringBuffer stringBuffer;

            try (FileReader fileReader = new FileReader(file)) {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                stringBuffer = new StringBuffer();
                String name;
                while ((name = bufferedReader.readLine()) != null) {
                    stringBuffer.append(name);
                    stringBuffer.append("\n");
                }
                
                String[] a = stringBuffer.toString().split("\n");
                // List<String> list = new ArrayList<>();

                for (int i = 0; i < 2; i++) {
                    String kata = a[i].replaceAll("\\.", "").replaceAll("\\?", "\\?.");
                    String[] b = kata.split(" ");
                    System.out.print(b[1] + ". " + b[0] + " ");

                    for (int j = 2; j < b.length; j++) {
                        System.out.print(b[j] + " ");
                    }

                    System.out.println(".");
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}