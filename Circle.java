/*
 * Simple program for calculating segment area of circle 
 */

public class Circle {
    public static void main(String[] args) {

        System.out.println(Circle.CircleSegmentArea(5, 30));
        
    }
    
    public static double Area(double r) {

        return Math.PI * Math.pow(r, 2);     
    }

    public static double Circumference(double r) {

        return Math.PI * r *2;         
    }

    public static double CircleSegmentArea(double r, double angle) {

        return (Math.PI * Math.pow(r, 2)*angle) / 360 ;         
    }



}
