// Программа находит минимум из двух чисел.
public class Main {
    public static void main(String[] args) {
        double a = 102.0, b = 67.7, c = 105.0;
        if (a < b && a < c) {
            System.out.println("Min a: " + a);
        }
        if (b < a && b < c) {
            System.out.println("Min b: " + b);
        }
        if (c < a && c < b) {
            System.out.println("Min c: " + c);
        }
    }
}