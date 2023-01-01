// Программа выводит сумму элементов и длину массива
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 12;
        array[1] = 23;
        array[2] = 34;
        array[3] = 45;
        array[4] = 56;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + array[i];
        }
        int len = array.length;
        System.out.println("Sum = " + sum + "; Len = " + len);
    }
}