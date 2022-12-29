import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();

        double[] array = new double[n];
        double max, min;

        for (int i = 0; i < n; i++) {
            array[i] = in.nextDouble();
        }

        max = array[0];
        min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        in.close();

        System.out.println(min);
        System.out.println(max);
    }
}