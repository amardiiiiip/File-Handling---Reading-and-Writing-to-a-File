import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        int lines = 0, words = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            bw.write("Total Lines: " + lines + "\n");
            bw.write("Total Words: " + words);
            bw.close();

            System.out.println("File processed successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading/writing file!");
        }
    }
}
