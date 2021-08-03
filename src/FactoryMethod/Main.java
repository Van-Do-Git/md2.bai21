package FactoryMethod;

public class Main {
//    public static void main(String[] args) {
//        AnimalFactory animalFactory = new AnimalFactory();
//        Animal a1 = animalFactory.getAnimal("feline");
//        Animal a2 = animalFactory.getAnimal("canine");
//        System.out.println(a1.makeSound());
//        System.out.println(a2.makeSound());
//    }
    public static void main(String[] args) {
    FactoryShape factoryShape = new FactoryShape();
    Shape a1 =  factoryShape.creatShape(ShapeType.CIRClE);
    Shape a2  = factoryShape.creatShape(ShapeType.TRIAGLE);
    Shape a3 = factoryShape.creatShape(ShapeType.RECTANGEL);
    a1.draw();
    a2.draw();
    a3.draw();
    }
}
