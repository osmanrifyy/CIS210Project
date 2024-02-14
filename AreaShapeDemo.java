/**
 * Osman Goni Rifat
 * CIS210-0900
 * Homework 3
 * Due- 10/11-9:00AM
 */
public class AreaShapeDemo {
    public static void main(String[]args){
        //literal values and declare variables
        int sWidth=5;
        int sLength=7;
        double tBase= 9.0;
        double tHeight=15.0;
        double sqr;
        double tri;
        //calculate area of sqr with literal values and output
        sqr = AreaShape.getArea(sWidth, sLength);
        System.out.println("Area of square with width " + sWidth + " and length " + sLength + ": " + sqr);
        //calculate area of tri with literal values and output
        tri=AreaShape.getArea(tBase,tHeight);
        System.out.println("Area of triangle with base " + tBase + " and height " + tHeight + ": " + tri);


    }
}
