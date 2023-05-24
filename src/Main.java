import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coordinates of the first point (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        Point p1 = new Point(x1,y1);

        System.out.print("Enter the coordinates of the second point (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Point p2 = new Point(x1,y1);

        Circle circle1 = new Circle(p1,p2);
        Circle circle2 = new Circle(p2,p1);

        System.out.println("Circle - 1: ");
        circle1.display();

        System.out.println("Circle - 2: ");
        circle2.display();

    }
}