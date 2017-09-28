package com.example.ProblemSet2;

/**
 * Created by t00194492 on 28/09/2017.
 */
public class TestDistance {
    public static void main(String[] args) {
        double distance;
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(5,5);

        System.out.print(p1);
        System.out.print(p2);

        p2.moveHorizontally(7);

        System.out.print(p2);

        p1.moveVertically(6);

        System.out.print(p1);

        distance = p2.distanceFromOrigin(p2.getXVal(), p2.getYVal());

        System.out.print(distance);
    }//End of main
}//End of TestDistance Class
