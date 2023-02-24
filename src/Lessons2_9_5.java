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
    }
}