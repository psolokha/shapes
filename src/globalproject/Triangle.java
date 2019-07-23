package globalproject;

public class Triangle extends Lines{
    private Point2D A,B,C;
    private Lines a,b,c;
    private double totalLengh;
    private double area;
    private String name;

    public Triangle() {
        super();
        this.C = new Point2D();
    }
    
        public Triangle(Point2D A, Point2D B, Point2D C) {
        this(A,B,C,A.getName()+B.getName()+C.getName());
    }
    
    public Triangle(Point2D A, Point2D B, Point2D C, String name) {
        this.name = name;
        this.A = A;
        this.B = B;
        this.C = C;
        this.a = new Lines(A,B);
        this.b = new Lines(B,C);
        this.c = new Lines(A,C);
        this.totalLengh = this.getTotalLengh();
        this.area = this.getArea();
    }
    
    public double getTotalLengh(){
        return a.getLength()+b.getLength()+c.getLength();
    }
    
    public double getArea(){
        return Math.sqrt((this.getTotalLengh()/2)*((this.getTotalLengh()/2)-a.getLength())*((this.getTotalLengh()/2)-b.getLength())*((this.getTotalLengh()/2)-c.getLength()));
    }
    
    public Point2D getC() {
        return C;
    }

    public void setC(Point2D C) {
        this.C = C;
    }

    @Override
    public Point2D getA() {
        return A;
    }

    @Override
    public void setA(Point2D A) {
        this.A = A;
    }

    @Override
    public Point2D getB() {
        return B;
    }

    @Override
    public void setB(Point2D B) {
        this.B = B;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    public Lines geta(){
        return this.a;
    }
    
    public Lines getb(){
        return this.b;
    }
    
    public Lines getc(){
        return this.c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "totalLengh=" + totalLengh + ", area=" + area + ", name=" + name + '}';
    }
    
    
    
}



