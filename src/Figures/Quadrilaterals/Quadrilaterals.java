package Figures.Quadrilaterals;
import Figures.Figures;

public class Quadrilaterals extends Figures {
    public Quadrilaterals() {

    }
    public Quadrilaterals(String typefigure) {
        switch (typefigure) {
            case "isoscelestriangles":
                ConvexQuadrilaterals convexquadrilateral = new ConvexQuadrilaterals();
                break;
            case "parallelogram":
                Parallelograms parallelogram = new Parallelograms();
                break;
            case "rectangle":
                Rectangles rectangle = new Rectangles();
                break;
            case "square":
                Squares square = new Squares();
                break;
            case "rhombus":
                Rhombus rhombus = new Rhombus();
                break;
            case "trapeze":
                Trapezes trapeze = new Trapezes();
                break;
        }
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс четырехугольник.");
    }
}
class ConvexQuadrilaterals extends Quadrilaterals {
    public ConvexQuadrilaterals() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс выпуклый четырехугольник.");
    }
}
class Parallelograms extends Quadrilaterals {
    public Parallelograms() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс параллелограмм.");
    }
}
class Rectangles extends Quadrilaterals {
    public Rectangles() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс прямоугольник.");
    }
}
class Squares extends Quadrilaterals {
    public Squares() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс квадрат.");
    }
}
class Rhombus extends Quadrilaterals {
    public Rhombus() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс ромб.");
    }
}
class Trapezes extends Quadrilaterals {
    public Trapezes() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс трапеция.");
    }
}