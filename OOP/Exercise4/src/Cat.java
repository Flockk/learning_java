public class Cat implements Voiceable {

    private String breed;
    private String size;
    private int age;

    public Cat(String breed, String size, int age) {
        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    @Override
    public void makeVoice() {
        System.out.println("Meow Meow Meow");
    }
}
