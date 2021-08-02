package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("feline");
        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println(a1.makeSound());
        System.out.println(a2.makeSound());
    }
}
