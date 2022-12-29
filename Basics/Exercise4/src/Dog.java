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

    /**
     * 1 грамм углеродов = 4 калории,
     * 1 грамм белка = 4 калории,
     * 1 грамм жира = 9 калорий
     */
    int eat(int carbohydrates, int squirrels, int fats) {
        return 4 * (carbohydrates + squirrels) + 9 * fats;
    }
}
