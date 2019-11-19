package by.belhard.j18.lesson_class.lesson9;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class IOExampel {
    public static void main(String[] args) {
        InputStream input= new FileInputStream();
        File file = new File("testInput.ti");
        InputStream input = new FileInputStream(file);
    }
}
