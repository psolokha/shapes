package globalproject;

public class Point2D {
//    static{
//        System.out.println("string in static!");
//    }
    private double x,y;
    private String name;
    private double length;
    private int pointID;
    private static int pointsCounter;
    
    

    public Point2D() {
        this(0, 0);
    }

    public Point2D(double x, double y) {
        this(x, y, "Point-"+pointsCounter);
        pointID = pointsCounter++;
    }
    
    public Point2D(double x, double y, String name) {
        setX(x);
        setY(y);
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        length();
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        length();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    @Override
    public String toString() {
        return name+": (" + x + ", " + y + ")";
    }
    
    private void length() {
        length = Math.sqrt(x*x + y*y);
    }
    
    public Point2D addTo(Point2D rValue) {
        return new Point2D(this.x + rValue.x, this.y + rValue.y, "TempPoint");
    }
    
    public double  distanceTo(Point2D rValue){
        return Math.sqrt((this.x-rValue.x)*(this.x-rValue.x) + (this.y-rValue.y)*(this.y-rValue.y));
    }
    
    public boolean compareTo(Point2D p1){
        return this.distanceTo(Points.CENTER)>p1.distanceTo(Points.CENTER);
    }
    
    public boolean equals(Point2D p1){
        return this.distanceTo(Points.CENTER) == p1.distanceTo(Points.CENTER);
    }
//  public Point2D addTo(Point2D p) {
//    Point2D tempPoint = new Point2D(this.x+p.getX(), this.y+p.getY(), "tempPoint");
//    return tempPoint;
//    }
//  public double distanceTo(Point2D p) {
//    double dist = Math.sqrt((p.getX()-this.x)*(p.getX()-this.x)+(p.getY()-this.y)*(p.getY()-this.y));
//    return dist;
//    }

}