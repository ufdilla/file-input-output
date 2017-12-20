import java.io.*;
import java.util.*;
/**
 * inputFile
 */
public class inputFile 
{

    public static void main (String[] args) throws IOException 
    {
        // membaca isi pada file  input.txt
        BufferedReader in = new BufferedReader (new FileReader ("input.txt"));
        String str, str1, str2, str3;
        StringBuffer stringBuffer;
        while ((str = in.readLine ()) != null) 
            {
            //menghilangkan semua dot
            str1 = str.replaceAll ("[.]", ""); 
            // meletkkan titik setelah quest mark
            str2 = str.replaceAll ("[?]", "?.");

            // memecah kalimat per spasi
            for (String retval: str.split ("\\s"))
                {
                System.out.println (retval);
                }

            //menyisipkan karakter didalam string
            str2 = new StringBuffer(str).insert(1, "zzzzz").toString();

            System.out.println(str1);
        }
    }
}
