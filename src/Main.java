import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader("data/info.txt"));
            for (;;) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                builder.append(line + "\n");
            }
//            FileInputStream is = new FileInputStream("data/info.txt");
//            for (;;) {
//                int code = is.read();
//                if (code < 0) {
//                    break;
//                }
//                char ch = (char) code;
//                builder.append(ch);
//            }

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(builder.toString());
//        StringBuilder builder = new StringBuilder();
//
//        try {
//            List<String> lines = Files.readAllLines(Paths.get("data/info.txt"));
//            lines.forEach(line -> builder.append(line + "\n"));
//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//        System.out.println(builder.toString());
    }
}