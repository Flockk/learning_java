class Dog {
    private final String breed;
    private final String size;
    private final int age;

    Dog(String breed, String size, int age) {

        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    void getInfo() {
        System.out.println("breed:" + this.breed + ", " + "size:" + this.size + ", " + "age:" + this.age);
    }
}
