package globalproject;


public class Circle extends Shape{
    private int r;

    public Circle(int r, double x, double y, String name) {
        super(x, y, name);
        this.r = r;
    }

    public double getArea(){
        return Math.PI*r*r;
    }
    
    public double getTotalLength(){
        return Math.PI*r*2;
    }

    @Override
    public double area() {
       return Math.PI*r*r;
    }
    
}
