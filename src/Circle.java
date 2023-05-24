public class Circle {
    private double centerX,centerY;
    private double radius;

    public Circle (Point p1, Point p2){
        centerX = (p1.x + p2.x) / 2;
        centerY = (p1.y + p2.y) / 2;
        radius = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y,2)/2);
    }
    public void display (){
        System.out.println("Circle properties:");
        System.out.println("Center: ("+centerX+","+centerY+")");
        System.out.println("Radius: " + radius);
    }
}
