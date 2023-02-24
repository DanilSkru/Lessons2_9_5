import Figures.Figures;
import Figures.Quadrilaterals.Quadrilaterals;
import Figures.Triangles.Triangles;

public class Lessons2_9_5 {
    public static void main(String[] args) {
        Figures figure = new Figures();
        figure.info();
        Triangles triangle = new Triangles();
        triangle.info();
        Quadrilaterals quadrilateral = new Quadrilaterals();
        quadrilateral.info();
    }
}