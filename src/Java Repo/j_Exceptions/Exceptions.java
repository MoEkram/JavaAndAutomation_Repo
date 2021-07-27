package j_Exceptions;

// handling exceptions that may happen while runtime, ex:
//      - user enter invalid data
//      - app. can't reach file on the machine ( file not found )
//      - Network connection error.
// any exception has handling in Java


import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class Exceptions {
    public static void main(String[] args) {

        Exceptions demo = new Exceptions();
        demo.TestArray();
    }

    public void TestArray (){

        try {
            int num[] = {1,2,3,4};
            System.out.println(num[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throw: " + e);
        }

        System.out.println("out of block");


    }

}
