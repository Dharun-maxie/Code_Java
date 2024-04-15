import java.io.IOException;

import java.io.FileReader;

public class FileREADER {
    public static void main(String[] args) {
        // try (InputStreamReader ipr = new InputStreamReader(System.in)) {
        // System.out.println("Enter the Name : ");
        // int line = ipr.read();
        // while (ipr.ready()) {
        // System.out.println((char)line);
        // line = ipr.read();
        // }
        // }
        // catch(IOException e){
        // System.out.print(e.getMessage());
        // }

        try (FileReader fr = new FileReader(
                "D:\\Study\\1.programming material\\NO.1 Priority\\Java + DSA\\codeOOP\\src\\Stream\\TEXT.txt")) {
            int line = fr.read();
            while (line != -1) {
                System.out.print((char) line);
                line = fr.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}