package globalproject;

public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(Lines a) {
        super(a, new Lines(a.getB(),new Point2D(a.getB().getX(),a.getB().getY()+a.getLength())));
    }
    
    @Override
    public double getArea(){
        return super.getA().distanceTo(super.getB())*super.getA().distanceTo(super.getB());
    }

    @Override
    public String toString() {
       return "Square{" + "totalLengh=" + super.getTotalLengh() + ", area=" + this.getArea() + ", name=" + super.getName() + '}';
    }
    
    
}
