import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ConverterString converter = new ConverterString();
        String str, strUpper, strLower;
        str = s;
        strUpper = converter.toUpperCase(str);
        strLower = converter.toLowerCase(str);

        System.out.println(strUpper);
        System.out.println(strLower);
    }
}