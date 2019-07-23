package globalproject;

public class Quadrangle {
    private Point2D A,B,C,D;
    private Lines a,b,c,d;
    private double totalLengh;
    private double area;
    private String name;
    
    
    public Quadrangle(){
        this(new Point2D(),new Point2D(),new Point2D(),new Point2D(),"0");
    }

    public Quadrangle(Point2D A, Point2D B, Point2D C, Point2D D, String name) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.name = name;
        this.a = new Lines(A,B);
        this.b = new Lines(B,C);
        this.c = new Lines(C,D);
        this.d = new Lines(A,D);
        this.totalLengh = this.getTotalLengh();
        this.area = this.getArea();
    }

    public Quadrangle(Point2D A, Point2D B, Point2D C, Point2D D) {
        this(A,B,C,D,A.getName()+B.getName()+C.getName()+D.getName());
    }
    
    public double getTotalLengh(){
        return a.getLength()+b.getLength()+c.getLength()+d.getLength();
    }
    
    public double getArea(){
        return Math.sqrt((this.getTotalLengh()/2-a.getLength())*(this.getTotalLengh()/2-b.getLength())*(this.getTotalLengh()/2-c.getLength())*(this.getTotalLengh()/2-d.getLength()));
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

    public Point2D getC() {
        return C;
    }

    public void setC(Point2D C) {
        this.C = C;
    }

    public Point2D getD() {
        return D;
    }

    public void setD(Point2D D) {
        this.D = D;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Quadrangle{" + "totalLengh=" + totalLengh + ", area=" + area + ", name=" + name + '}';
    }
    
    
}
