package Figures;

public class Figures {
    public Figures() {
        info();
    }
    public Figures(String typefigure) {
        switch (typefigure) {
            case "pentagon":
                Pentagons pentagon = new Pentagons();
                break;
            case "hexagon":
                Hexagons hexagon = new Hexagons();
                break;
            case "ellipse":
                Ellipses ellipse = new Ellipses();
                break;
            case "circle":
                Circles circle = new Circles();
                break;
        }
    }
    public void info() {
        System.out.println("Инициализирован класс фигура.");
    }
}
class Pentagons extends Figures{
    public Pentagons() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс пятиугольник.");
    }
}
class Hexagons extends Figures {
    public Hexagons() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс шестиугольник.");
    }
}
class Ellipses extends Figures {
    public Ellipses() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс эллипс.");
    }
}
class Circles extends Figures {
    public Circles() {
        super();
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс окружность.");
    }
}