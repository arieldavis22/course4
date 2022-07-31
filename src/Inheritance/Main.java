package Inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", 1, 1, 5, 5);

        Dog dog = new Dog("yourkie", 8, 20 , 2, 4, 1, 20, "long silkny");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
