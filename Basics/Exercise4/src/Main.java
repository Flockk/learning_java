public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Mastiff", "big", 4);
        dog.getInfo();

        int calories = dog.eat(40, 50, 30);

        System.out.println(calories);
    }
}