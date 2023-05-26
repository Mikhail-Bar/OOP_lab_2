public class Circle {
    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }


    public double getRadius() {
        return radius;
    }

    private double centerX, centerY;
    private double radius;

    public Circle(Point p1, Point p2) {
        centerX = (p1.getX() + p2.getX()) / 2;
        centerY = (p1.getY() + p2.getY()) / 2;
        radius = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2) / 2);
    }

    public void display() {
        System.out.println("Circle properties:");
        System.out.println("Center: (" + centerX + "," + centerY + ")");
        System.out.println("Radius: " + radius);
    }

}
