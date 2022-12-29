public class Dog {

    // Поля класса
    String breed;
    String size;
    int age;
    String color;

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
}
