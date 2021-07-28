package j_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions2 {
    public static void main(String[] args) {
        File file = new File ("C://file.txt");
        FileReader reader;
        {
            try {
                reader = new FileReader( file);
            } catch (FileNotFoundException e) {
                System.out.println("the exception is \n" + e);
            }
        }
    }



}
