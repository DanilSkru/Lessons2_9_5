import Figures.Figures;
import Figures.Quadrilaterals.Quadrilaterals;
import Figures.Triangles.Triangles;

public class Lessons2_9_5 {
    public static void main(String[] args) {
        Figures figure = new Figures();
        Triangles triangle = new Triangles();
        Quadrilaterals quadrilateral = new Quadrilaterals();
        Figures pentagon = new Figures("pentagon");
        Figures hexagon = new Figures("hexagon");
        Figures ellipse = new Figures("ellipse");
        Figures circle = new Figures("circle");
        Triangles isoscelestriangles = new Triangles("isoscelestriangles");
        Triangles equilateraltriangles = new Triangles("equilateraltriangles");
        Triangles righttriangles = new Triangles("righttriangles");
        Quadrilaterals convexquadrilateral = new Quadrilaterals("convexquadrilateral");
        Quadrilaterals parallelogram = new Quadrilaterals("parallelogram");
        Quadrilaterals rectangle = new Quadrilaterals("rectangle");
        Quadrilaterals square = new Quadrilaterals("square");
        Quadrilaterals rhombus = new Quadrilaterals("rhombus");
        Quadrilaterals trapeze = new Quadrilaterals("trapeze");
    }
}