package Figures.Triangles;
import Figures.Figures;

public class Triangles extends Figures {
    public Triangles() {

    }
    public Triangles(String typefigure) {
        switch (typefigure) {
            case "isoscelestriangles":
                IsoscelesTriangles isoscelestriangles = new IsoscelesTriangles();
                break;
            case "equilateraltriangles":
                EquilateralTriangles equilateraltriangles = new EquilateralTriangles();
                break;
            case "righttriangles":
                RightTriangles righttriangles = new RightTriangles();
                break;
        }
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс треугольник.");
    }
}
class IsoscelesTriangles extends Triangles {
    public IsoscelesTriangles() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс равносторонний треугольник.");
    }
}
class EquilateralTriangles extends Triangles {
    public EquilateralTriangles() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс равнобедренный треугольник.");
    }
}
class RightTriangles extends Triangles {
    public RightTriangles() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс прямоугольный треугольник.");
    }
}