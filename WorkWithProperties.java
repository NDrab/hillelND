package Homework_Files;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class WorkWithProperties {

    public static void main (String [] args) throws IOException{

        try {
            // created the directory
            new File("src/main/resources/MyNewDirectory").mkdir();

            InputStream input = new FileInputStream("src/main/resources/config.properties");

            Properties prop = new Properties();

            prop.load(input);
            String fileName = prop.getProperty("name");

            //create file. File name should be taken from properties file
            File file = new File("src/main/resources/" + fileName);
            System.out.println("File with the name " + fileName + " was created");

            //write info about yourself in the file
            String str = "Hello. My name is Nadia Drab. I work as a Junior QA Automation. I love Java.";
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(str);
            writer.close();

            //move file to created directory
            boolean rename = file.renameTo(new File("src/main/resources/MyNewDirectory/" + fileName));
            if (rename=true){
                System.out.println("File was moved to directory");
            } else throw new java.io.FileNotFoundException("The system cannot find the file specified");


            //print data from the file
            Scanner myReader = new Scanner(new File("src/main/resources/MyNewDirectory/" + fileName));
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("My file contains:" + data);
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
