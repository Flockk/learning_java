public class Dog extends Animal {
    private String breed;

    public Dog(String breed, String size, int age) {
        super(size, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
