public class Triangle {
    private Point P0, P1, P2;

    public Triangle(Point p0, Point p1, Point p2) {
      P1 = p1;
      P2 = p2;
      P0 = p0;
    }

    public Triangle(double px0, double py0, double px1, double py1, double px2, double py2) {
      Point P0 = new Point(px0, py0);
      Point P2 = new Point(px2, py2);
      Point P1 = new Point(px1, px1);
    }

    public Point getVertex(int index) {
      if (index == 0) {
        return P0;
      }
      if (index == 1) {
        return P1;
      }
        return P2;
      // i  know this is sloppy, but i don't know how to give a 'false' statement in terms of point
      // like i have to return something, but i can't do -1 in case index is out of bounds. so i just put 'return p2'
    }

    public double perimeter() {
      return P0.distanceTo(P1) + P1.distanceTo(P2) + P2.distanceTo(P0);
    }

    public void setVertex(int index, Point newP) {
      if (index == 0) {
        P0 = newP;
      }
      if (index == 1) {
        P1 = newP;
      }
      if (index == 2) {
        P2 = newP;
      }
    }

    public String toString() {
      return "Triangle:" + " A(" + P0.getX() + ", " + P0.getY() + ") B(" + P1.getX() + ", " + P1.getY() + ") C("  + P2.getX() + ", " + P2.getY() + ")";
    }
}
