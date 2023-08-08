import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // File Reader

    public static void main(String[] args) throws Exception {
        File f = new File("CTCI.txt");
        // Menu Sections
        System.out.println("Welcome to SpeedRead 1.0\n");
        List<String> menu = new ArrayList<>();
        menu.add("1. Read a file");
        menu.add("2. View library");
        menu.add("3. Create a Library");

        for (String item : menu) {
            System.out.println(item);
        }

        // Menu Selection
        System.out.println("\nPlease select an option: ");
        Scanner s = new Scanner(System.in);
        String selection = s.nextLine();
        System.out.println("You selected: " + selection);

        if (selection.equals("1")) {
            ReaderForCTCI reader = new ReaderForCTCI();
            Thread thread = new Thread(reader);
            thread.start();
        }
    }
}
