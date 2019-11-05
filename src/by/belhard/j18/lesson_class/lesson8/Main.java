package by.belhard.j18.lesson_class.lesson8;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:/nofile.no");


try {
    OutputStream stream = new FileOutputStream(file);

    stream.write(1);
}catch (FileNotFoundException e){
    System.err.println(e);
    } catch (IOException e){
    e.printStackTrace();

    }

        }
}
