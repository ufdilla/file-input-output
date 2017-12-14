import java.io.*;
/**
 * inputFile
 */
public class inputFile {

    public static void main(String[] args) throws IOException {
        FileInputStream Input1 = null;
        FileOutputStream Ouput1 = null;

        try 
        {
            Input1 = new FileInputStream("daftar_pustaka.txt");
            Ouput1 = new FileOutputStream("daftar_Pustaka_Output.txt");
        } 
        catch (Exception e) 
        {
            e.getStackTrace();
        }
    }
}