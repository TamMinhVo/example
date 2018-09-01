package citynow.uit.tamvm.model;

public class LineSegment {
    private Point p1;
    private Point p2;

    public Point getP1() {
        return p1;
    }
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    public Point getP2() {
        return p2;
    }
    public void setP2(Point p2) {
        this.p2 = p2;
    }
    public LineSegment(){
        this.p1= new Point(0,0);
        this.p2= new Point(0,0);
    }
    public LineSegment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public LineSegment(LineSegment lineSegment){
        this.p1 = lineSegment.p1;
        this.p2 = lineSegment.p2;
    }
    public void InputLineSegment(){
        System.out.println("Enter the coordinate of point 1: ");
        this.p1.InputPoint();
        System.out.println("Enter the coordinate of point 2: ");
        this.p2.InputPoint();
    }
    public void OutputLineSegment(){
        System.out.println("Ouput the coordinates of LineSegment with point 1: ");
        this.p1.OutputPoint();
        System.out.print(" and point 2: ");
        this.p2.OutputPoint();
        System.out.println();
    }
    public double LengthOfLineSegment(){
        double length=0;
        length = this.p1.DistanceOf(this.p2);
        return length;
    }
    public Point MidpointOfLineSegment(){
        Point point = new Point();
        point.setX((this.p1.getX() + this.p2.getX())/2);
        point.setY((this.p1.getY() + this.p2.getY())/2);
        return point;
    }
    public LineSegment ProjectionLineSegment_Ox(){
        LineSegment lineSegment = new LineSegment();
        lineSegment.p1 = this.p1.ProjectionPointOx();
        lineSegment.p2 = this.p2.ProjectionPointOx();
        return lineSegment;
    }
    public LineSegment ProjectionLineSegment_Oy(){
        LineSegment lineSegment = new LineSegment();
        lineSegment.p1 = this.p1.ProjectionPointOy();
        lineSegment.p2 = this.p2.ProjectionPointOy();
        return lineSegment;
    }
    public static LineSegment parseLineSegment(String string){
        LineSegment lineSegment = new LineSegment();
        String strs[] = string.split(",");
        lineSegment.p1 = Point.parsePoint(strs[0]);
        lineSegment.p2 = Point.parsePoint(strs[1]);
        return lineSegment;
    }
    @Override
    public String toString() {
        return this.p1.toString() + "; " + this.p2.toString();
    }
}
