import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start read and write");
        String inputFileName = "input.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String outputFileName = "output.txt";
        String[] mas = {"red", "green", "blue"};
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName, true))) {
            for (String str : mas) {
                writer.write(str + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}