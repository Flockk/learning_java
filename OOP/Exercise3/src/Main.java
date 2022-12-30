public class Main {
    public static void main(String[] args) {

        Figure rect = new Rectangle(5, 5, 10, 15);
        Figure circle = new Circle(7, 7, 12);

        System.out.println("Perimeter rect: " + rect.getPerimeter());
        System.out.println("Perimeter circle: " + circle.getPerimeter());
    }
}