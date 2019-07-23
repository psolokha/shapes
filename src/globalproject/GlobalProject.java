package globalproject;

//import java.lang.reflect.Method;

public class GlobalProject {

    public static void main(String[] args) /*throws ClassNotFoundException*/ {
        Point2D A = new Point2D(1,1,"A");
        Point2D B = new Point2D(1,6,"B");
        Point2D C = new Point2D(6,6,"C");
        Point2D D = new Point2D(6,1,"D");

        Lines line_a = new Lines(A, B, "a");
        System.out.println(line_a);
        
        Lines line_b = new Lines(B, C, "b");
        System.out.println(line_b);
        
        Triangle tri = new Triangle(A, B, C);
        System.out.println(tri);
        
        Quadrangle quad = new Quadrangle(A, B, C, D);
        System.out.println(quad);

        Rectangle rect = new Rectangle(line_a, line_b);
        System.out.println(rect);
        rect.setName("ABCD");
        System.out.println(rect);
        
        Square square = new Square(line_a);
        System.out.println(square);
        square.setName("ABCD");
        System.out.println(square);
        
        Point3D p3d = new Point3D(6, -.2, 4);
        System.out.println(p3d);
        
        Quadrangle[] quads = {quad,rect,square}; 
        
        StringBuilder areas =  arrayOfAreas(quads);
        System.out.println(areas);
        
        
//        System.out.println(Points.CENTER.getName());
//        double fig = new Points().figure(A, B, C, D);
//          Class c = Class.forName("globalproject.Point2D");
//          Method[] methods = c.getMethods();
//          for (Method method : methods) {
//              System.out.println(method.getName());
//       }

        
    }
    
    public static StringBuilder arrayOfAreas(Quadrangle[] arr){
        StringBuilder temp = new StringBuilder();
        for (Quadrangle quad1 : arr) {
            temp.append(quad1.getName()+": "+quad1.getArea()+"\n");
        }
        return temp;
    }
    
}