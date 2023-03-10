package projectnursery;

public class Dog extends Animal {

    // Поля класса
    private String breed;

    // Конструкторы класса
    Dog(String type) {
        super(type);
        this.breed = "unknown";
    }

    Dog(String breed, String size, int age, String color, String type) {

        super(size, age, color, type);
        this.breed = breed;
    }

    // Методы класса
    boolean eat(float weight, String food) {
        // ...
        return true;
    }

    int sleep() {
        // ...
        return 5;
    }

    float run(int task) {
        // Выполняем упражнение
        return 0.42f;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}