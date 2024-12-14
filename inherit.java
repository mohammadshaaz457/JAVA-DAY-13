class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

public class inherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
        dog.fetch();
    }
}
