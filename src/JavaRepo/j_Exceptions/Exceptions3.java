package j_Exceptions;

// you can handle more than 1 exception at same time


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions3 {


    public static void main(String[] args) {

        Exceptions3 exp3 = new Exceptions3();
        exp3.testMultiException();

    }

    public int testMultiException (){
        try{
            FileInputStream file = new FileInputStream ("C://file.txt");
            byte x = (byte) file.read();
        } catch (FileNotFoundException f)
        {
            f.printStackTrace();
            return -1;
        } catch (IOException i){
            i.printStackTrace();
            return -1;
        }
        return 1;
    }

}
