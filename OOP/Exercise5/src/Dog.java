public class Dog {

    private String breed;
    private String size;
    private int age;

    public Dog(String breed, String size, int age) throws NegativeAgeException {
        this.breed = breed;
        this.size = size;
        if (age < 0) {
            throw new NegativeAgeException(age);
        }
        this.age = age;
    }

    void getInfo() {
        System.out.println("breed:" + this.breed + ", " + "size:" + this.size + ", " + "age:" + this.age);
    }
}
