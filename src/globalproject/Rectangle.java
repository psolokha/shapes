package globalproject;

public class Rectangle extends Quadrangle{

    public Rectangle() {
        super();
    }

    public Rectangle(Point2D A, Point2D B, Point2D C, Point2D D, String name) {
        super(A, B, C, D, name);
    }

    public Rectangle(Point2D A, Point2D B, Point2D C, Point2D D) {
        super(A, B, C, D);
    }

public Rectangle(Lines a, Lines b){
    super(a.getA(),a.getB(),b.getB(), new Point2D(b.getB().getX(),a.getA().getY()));
}

    @Override
    public String toString() {
        return "Rectangle{" + "totalLengh=" + super.getTotalLengh() + ", area=" + super.getArea() + ", name=" + super.getName() + '}';
    }
   



}
