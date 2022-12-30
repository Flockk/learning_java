public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Mastiff", "big", 7);
        System.out.println(dog.getBreed() + " " + dog.getSize() + " " + dog.getAge());
        dog.setBreed("WhiteMastiff");
        dog.setSize("middle");
        dog.setAge(5);
        System.out.println(dog.getBreed() + " " + dog.getSize() + " " + dog.getAge());
    }
}