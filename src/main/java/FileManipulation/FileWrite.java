package FileManipulation;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("MyFile.txt", true);
        fw.write("Hello World");
        fw.close();

    }


}
