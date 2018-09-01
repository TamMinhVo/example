package citynow.uit.tamvm.model;

import java.util.Scanner;

public class Point {
    private int x;
    private int y;

    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void InputPoint(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coordinate x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the coordinate y: ");
        int y = scanner.nextInt();
        this.x = x;
        this.y = y;
    }
    public void OutputPoint(){
        System.out.println("The point has the coordinates: (" + this.x + "; " + this.y + ")");
    }
    public Point ProjectionPointX(){
        Point p = new Point();
        p.x=this.x;
        p.y=0;
        return p;
    }
    public Point ProjectionPointY(){
        Point p = new Point();
        p.y=this.y;
        p.x=0;
        return p;
    }
    public double DistanceOf(Point point){
        return Math.sqrt(Math.pow(Math.abs(this.x - point.x), 2) + Math.pow(Math.abs(this.y - point.y), 2));
    }
    public static Point parsePoint(String string){
        Point point = new Point();
        String[] s = string.split(";");
        point.x = Integer.parseInt(s[0].trim());
        point.y= Integer.parseInt(s[1].trim());
        return point;
    }
    @Override
    public String toString() {
        return "(" + this.x + "; " + this.y + ")";
    }
}
