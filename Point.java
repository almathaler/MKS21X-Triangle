import java.lang.Math;
//immutable point class:
public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public static double distance(Point pointOne, Point pointTwo) {
    return Math.sqrt(
                      (
                        (pointTwo.getX() - pointOne.getX()) * (pointTwo.getX() - pointOne.getX())
                      )
                        +
                      (
                        (pointTwo.getY() - pointOne.getY()) * (pointTwo.getY() - pointOne.getY())
                      )
                      );
  }
  public double distanceTo(Point pointTwo) {
    return Math.sqrt(((pointTwo.getX() - x) * (pointTwo.getX() - x)) + ((pointTwo.getY() - y) * (pointTwo.getY() - y)));
  }
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
