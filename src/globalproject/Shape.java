package globalproject;

public abstract class Shape {
    private double x,y;
    private String name;
    private Point2D point; 

    public Shape(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }
    
    public Shape(Point2D p1){
        this.x = p1.getX();
        this.y = p1.getY();
        this.name = p1.getName();
        this.point = p1;
    }
    
//public Point2D shapeToPoint(Point2D p1){
//    this.x = p1.getX();
//    this.y = p1.getY();
//    this.name = p1.getName();
//    Point2D shapePoint = new Point2D(this.x, this.y, this.name);
//    return shapePoint;
//}
    
    public abstract double area();
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Object \"Shape\": " + "x=" + x + ", y=" + y + ", name=" + name;
    }
    
    
}
