class Dog {
    private final String breed;
    private final String size;
    private final int age;
    private float weight = 5.0f;

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
    int eat(int carbohydrates, int proteins, int fats) {
        return 4 * (carbohydrates + proteins) + 9 * fats;
    }

    Dog(String breed, String size, int age, float weight) {

        this.breed = breed;
        this.size = size;
        this.age = age;
        this.weight = weight;
    }

    String checkCalories(int calories) {

        double norm = 535 / 10.0 * weight;

        if (calories > norm + 30) {
            return "overate";
        } else if (calories < norm - 30) {
            return "bad";
        } else {
            return "good";
        }
    }
}
