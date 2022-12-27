// программа обрабатыавает массив из 100 дробных чисел
public class Main {
    public static void main(String[] args) {

        int n = 100;
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            avg = avg + array[i];
        }
        avg = avg / array.length;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}