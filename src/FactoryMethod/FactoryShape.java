package FactoryMethod;

public class FactoryShape {
    public Shape creatShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRClE:
                return new Circle();
            case TRIAGLE:
                return new Triagle();
            case RECTANGEL:
                return new Rectagle();
            default:
                return null;
        }
    }
}
