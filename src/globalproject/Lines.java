package globalproject;

public class Lines {
    private Point2D A,B;
    private final double length;
    private String name;

    public Lines(){
        this(Points.CENTER, Points.CENTER, "tempLine0");
    }
    
    public Lines(Point2D B){
        this(Points.CENTER, B, "0"+B.getName());
    }
    
    public Lines(Point2D A, Point2D B){
        this(A, B, A.getName()+B.getName());
    }
    
    public Lines(Point2D A, Point2D B, String name) {
        this.A = A;
        this.B = B;
        this.name = name;
        this.length = A.distanceTo(B);
    }
    
    public Point2D getA() {
        return A;
    }

    public void setA(Point2D A) {
        this.A = A;
    }

    public Point2D getB() {
        return B;
    }

    public void setB(Point2D B) {
        this.B = B;
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getLength() {
        return length;
    }

    
    @Override
    public String toString() {
        return "Line: " + name + "(" + A.getName() + B.getName() + ")";
    }
    
    
}
