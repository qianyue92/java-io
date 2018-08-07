package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class TestFileIO {

    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("D:" + File.separator + "test.txt");
        if (file.exists()) {
            file.delete();
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        PrintStream ps = new PrintStream("D:" + File.separator + "test.txt");
        System.setOut(ps);
        System.out.println("打印语句！！！222");
    }
}
