package citynow.uit.tamvm.main;

import citynow.uit.tamvm.model.LineSegment;
import citynow.uit.tamvm.model.Point;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LineSegment lineSegment1 = new LineSegment();
        System.out.println("Line Segment 1: "+ lineSegment1);

        LineSegment lineSegment2 = new LineSegment(new Point(1,2), new Point(2,3));
        System.out.println("Line Segment 2: "+lineSegment2);

        LineSegment lineSegment3 = new LineSegment(lineSegment2);
        System.out.println("Line Segment 3: "+lineSegment3);

        LineSegment lineSegment4 = new LineSegment();
        lineSegment4.InputLineSegment();
        lineSegment4.OutputLineSegment();
        System.out.println(lineSegment4.LengthOfLineSegment());
        System.out.println(lineSegment4.MidpointOfLineSegment());
        System.out.println(lineSegment4.ProjectionLineSegment_Ox());
        System.out.println(lineSegment4.ProjectionLineSegment_Oy());
        System.out.println(lineSegment4.toString());
    }
}
