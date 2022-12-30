package projectnursery;

public class Dog {

    // Поля класса
    private String breed;
    private String size;
    private int age;
    private String color;

    // Конструкторы класса
    Dog() {
        this.breed = "unknown";
        this.size = "medium";
        this.age = 0;
    }

    Dog(String breed, String size, int age, String color) {

        this.breed = breed;
        this.size = size;
        this.age = age;

        if (color != null) {
            this.color = color;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    int sit() {
        // Возвращает, сколько дней собака находится в питомнике
        // ...
        return 42;
    }

    float run() {
        // Выполняем упражение
        return 0.42f;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
