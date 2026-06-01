class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
public class Inheritance_example {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Dog d = new Dog();
        obj.makeSound();
        d.makeSound();
    }
}
