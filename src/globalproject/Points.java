package globalproject;
public class Points {
    public static final Point2D CENTER = new Point2D();
    
    public Points(){
        
    }
//    
//    public Points(Point2D p1){
//        System.out.println("Only one point.");
//    }
//    
//    public Points(Point2D p1, Point2D p2){
//        Point2D point1 = p1;
//        Point2D point2 = p2;
//    }
//    public Points(Point2D p1, Point2D p2, Point2D p3){
//        Point2D point1 = p1;
//        Point2D point2 = p2;
//        Point2D point3 = p3;
//    }
//    
//    public Points(Point2D p1, Point2D p2, Point2D p3, Point2D p4){
//        Point2D point1 = p1;
//        Point2D point2 = p2;
//        Point2D point3 = p3;
//        Point2D point4 = p4;
//    }
//    
    public double distanceAB(Point2D p1, Point2D p2){
        Point2D A = p1;
        Point2D B = p2;
        return Math.sqrt((p2.getX()-p1.getX())*(p2.getX()-p1.getX())+(p2.getY()-p1.getY())*(p2.getY()-p1.getY()));
    }
    
    public double figure(Point2D p1, Point2D p2){
            System.out.println("Line");
            System.out.println("Length: "+distanceAB(p1, p2));
            return distanceAB(p1, p2);
        }
    public double figure(Point2D p1, Point2D p2, Point2D p3){
        System.out.println("Triangle");
        System.out.println("Length: "+(distanceAB(p1, p2)+distanceAB(p3, p2)+distanceAB(p1, p3)));
        return (distanceAB(p1, p2)+distanceAB(p3, p2)+distanceAB(p1, p3));
    }
    public double figure(Point2D p1, Point2D p2, Point2D p3, Point2D p4){
        if(distanceAB(p1, p2)==distanceAB(p1, p4)) System.out.println("Square");
        else if (distanceAB(p1, p2)==distanceAB(p3, p4)&&distanceAB(p1, p2)!=distanceAB(p3, p2)) System.out.println("Rectangle");
        else System.out.println("Quadrangle");
        System.out.println("Length: "+(distanceAB(p1, p2)+distanceAB(p3, p2)+distanceAB(p1, p4)+distanceAB(p3, p4)));
        return (distanceAB(p1, p2)+distanceAB(p3, p2)+distanceAB(p1, p4)+distanceAB(p3, p4));
    }
    
    public boolean isBrokenLine(Point2D p1, Point2D p2, Point2D p3){
        return (distanceAB(p1, p2)+distanceAB(p3, p2))==distanceAB(p1, p3);
    }
    
    //запрограммировать прямые(замкнутые?), ломанные (саморесечение?), фигуры(принадлежит точка?)
    
}