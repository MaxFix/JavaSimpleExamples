import java.io.*;

public class ReadWriteFromConsole {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String outputFileName;
            outputFileName = reader.readLine();

            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line + "\n");
                }
                writter.write("exit");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
