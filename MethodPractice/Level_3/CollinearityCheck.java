package MethodPractice.Level_3;


public class CollinearityCheck {

    // Method 1: Check using slope formula

    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {

        int slope1 = (y2 - y1) * (x3 - x2);



        int slope2 = (y3 - y2) * (x2 - x1);


        return slope1 == slope2;
    }

    
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) +
                   x2 * (y3 - y1) +
                   x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        System.out.println("Checking collinearity for points A(2,4), B(4,6), C(6,8)");

        boolean isCollinearBySlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean isCollinearByArea = areCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Using Slope Method: " + (isCollinearBySlope ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Method : " + (isCollinearByArea ? "Collinear" : "Not Collinear"));
    }
}
