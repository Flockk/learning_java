import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start read and write");

        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
            fileOutputStream.write(str.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("output.txt")) {

            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}