import java.io.FileReader;
import java.io.IOException;

public class Reader implements Runnable {

    @Override
    public void run() {
        try (FileReader read = new FileReader("CTCI.txt")) {
            int character;
            while ((character = read.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}