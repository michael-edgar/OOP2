package com.example.ProblemSet2;

/**
 * Created by t00194492 on 28/09/2017.
 */
public class MyPoint {

    private double xVal;
    private double yVal;

    public void setXVal(double xVal)
    {
        this.xVal = xVal;
    }//End of setXVal

    public double getXVal()
    {
        return xVal;
    }//End of getXVal

    public void setYVal(double yVal)
    {
        this.yVal = yVal;
    }//End of setYVal

    public double getYVal()
    {
        return yVal;
    }//End of getYVal

    public MyPoint()
    {
        this(0,0);
    }//End of MyPoint default

    public MyPoint(double xVal, double yVal)
    {
        setXVal(xVal);
        setYVal(yVal);
    }//End of MyPoint

    public String toString()
    {
        return String.format("xVal %-5.2f\nyVal %-5.2f\n\n", xVal, yVal);
    }//End of toString

    public double moveHorizontally(double xVal)
    {
        this.xVal += xVal;

        return this.xVal;
    }//End of moveHorizontally

    public double moveVertically(double yVal)
    {
        this.yVal += yVal;

        return this.yVal;
    }//End of moveVertically

    public void translate(double xVal, double yVal)
    {
        this.xVal += xVal;
        this.yVal += yVal;
    }//End of translate

    public double distanceFromOrigin(double xVal, double yVal)
    {
        double distance;

        distance = Math.sqrt((yVal*yVal)+(xVal*xVal));

        return distance;
    }//End of distanceFromOrigin
}//End of MyPoint Class
