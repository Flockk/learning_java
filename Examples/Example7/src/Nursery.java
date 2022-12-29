public class Nursery {

    public static void main(String[] args) {

        Dog mastiff = new Dog();

        mastiff.breed = "Neapolitan Mastiff";
        mastiff.size = "large";
        mastiff.age = 5;
        mastiff.color = "black";

        Dog maltese = new Dog("Maltese", "small", 2, "white");

        System.out.println("First dog: " + mastiff.breed + ", " + mastiff.age + ", " + mastiff.color);
        System.out.println("Second dog: " + mastiff.breed + ", " + mastiff.age + ", " + mastiff.color);
    }
}
