package file;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception{
        // test your code here

        Analysis a = new Analysis( new File("test/testfile.txt") );
        System.out.println("Lines: " + a.lines());
        System.out.println("Characters: " + a.characters());

    }
}
