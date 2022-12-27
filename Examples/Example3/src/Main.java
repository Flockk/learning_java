// Программа находит факториал числа.
public class Main {
    public static void main(String[] args) {
        int n, factorial = 1;
        n = 5;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial n(5) = " + factorial);
    }
}