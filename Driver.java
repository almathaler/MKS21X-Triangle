public class Driver{

  /* more methods can go here*/
  public static void main(String[]args){
    Point P0 = new Point(0,0);
    Point P1 = new Point(3,0);
    Point P2 = new Point(0,4);
    //test point
    System.out.println("P0:" + P0);
    System.out.println("P1:" + P1);
    System.out.println("P2:" + P2);
    System.out.println("(static)Distance from P0 to P1:"  + Point.distance(P0,P1));
    System.out.println("(nonstatic) Distance from P0 to P1:"  + P0.distanceTo(P1));
    System.out.println("(static)Distance from P1 to P2:"  + Point.distance(P1,P2));
    System.out.println("(nonstatic) Distance from P1 to P2:"  + P1.distanceTo(P2));
    System.out.println("(static)Distance from P2 to P0:"  + Point.distance(P2,P0));
    System.out.println("(nonstatic) Distance from P2 to P0:"  + P2.distanceTo(P0));
    //test Triangle
    Triangle t0 = new Triangle (P0, P1, P2);
    Triangle t1 = new Triangle(P0.getX(), P0.getY(), P1.getX(), P1.getY(), P2.getX(), P2.getY());
    System.out.println(t0);
    System.out.println(t1);
    System.out.println("Perimeter of t0:" + t0.perimeter());
    System.out.println("perimeter of t1:" + t1.perimeter());
    System.out.println("the three vertices of t1:" + t1.getVertex(0) + t1.getVertex(1) + t1.getVertex(2));
    System.out.println("the three vertices of t0:" + t0.getVertex(0) + t0.getVertex(1) + t0.getVertex(2));
    System.out.println("We just changed the vertices of t1, let's compare them to t0's (which are the same as t1's)");
    //mutators
    Point P3 = new Point(0,1);
    Point P4 = new Point(3,1);
    Point P5 = new Point(0,5);

    t1.setVertex(0, P3);
    t1.setVertex(1, P4);
    t1.setVertex(2, P5);

    System.out.println(t1);
    //done!
  }
 }
