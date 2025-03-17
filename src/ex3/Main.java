package ex3;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();


        System.out.println("con cho keu: ");
        dog.makeSound();

        System.out.println("con meo keu: ");
        cat.makeSound();
    }
}
