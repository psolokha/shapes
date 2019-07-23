package globalproject;

public class Point3D extends Point2D{
    private double z;

    public Point3D() {
        this(0,0,0);
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    @Override
    public void setX(double x){
        super.setX(x);
    }
    
    @Override
    public void setY(double y){
        super.setY(y);
    }
    
    @Override
    public double getX(){
        return super.getX();
    }
    
    @Override
    public double getY(){
        return super.getY();
    }

    @Override
    public String toString() {
        return  super.getName()+" (" + super.getX() + ", " + super.getY() + ", " +  z + ")";
    }
    
    
    
}
