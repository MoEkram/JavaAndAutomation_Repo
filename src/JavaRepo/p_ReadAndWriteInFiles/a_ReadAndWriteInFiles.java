package p_ReadAndWriteInFiles;

// We use : - FileWriter to write in file
//          - BufferReader to read from file

import java.io.*;

public class a_ReadAndWriteInFiles {
    public static void main(String[] args) {

        // create new file and give the path and the name of the file
        File file = new File("Hello.text");

        try {

            file.createNewFile();   // create the file
            FileWriter writer = new FileWriter(file);    // Start writing inside the file, give him the file
            writer.write("Hello from created file");
            writer.flush();  // to start writing
            writer.close();  // close the connection with this file

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Start read from created file
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(file));

            String line ;

            // read line by line until the end of the file
            while( (line = reader.readLine()) != null){

                System.out.println(line);

            }
            reader.close();   // close the connection with this file

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
