import java.util.Scanner;
public class LineComp {
    public static void main(String[] args) {
        // USE CASE 1 - Welcome Message
        System.out.println("Welcome to the Line Comparison Problem");

        int x1, x2, y1, y2, x3, x4, y3, y4;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Coordinates for Line 1 :");
        System.out.println("Enter the value of x1 :");
        x1 = sc.nextInt();
        System.out.println("Enter the value of y1 :");
        y1 = sc.nextInt();
        System.out.println("Enter the value of x2 :");
        x2 = sc.nextInt();
        System.out.println("Enter the value of y2 :");
        y2 = sc.nextInt();

        System.out.println("Enter the Coordinates for Line 2 :");
        System.out.println("Enter the value of x3 :");
        x3 = sc.nextInt();
        System.out.println("Enter the value of y3 :");
        y3 = sc.nextInt();
        System.out.println("Enter the value of x4 :");
        x4 = sc.nextInt();
        System.out.println("Enter the value of y4 :");
        y4 = sc.nextInt();

        // USE CASE 1 - Length of the Line
        double len1 = lengthOfLine(x1, x2, y1, y2);
        double len2 = lengthOfLine(x3, x4, y3, y4);

        // USE CASE 2 - Equality of the Lines
        areLinesEqual(len1, len2);

        // USE CASE 3 - Comparison of the Lines
        greaterEqualOrLessThan(len1, len2);
    }

    /*
        USE CASE 1
        As a fan of geometry, I want to model a line based on
        a point consisting of (x, y) co-ordinates
        using the Cartesian system,
        So that I can calculate its length

        - A Length as 2 Points (x1, y1) and (x2, y2)
        - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)
    */
    public static double lengthOfLine(int x1, int x2, int y1, int y2){
        double length = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("The length of a line using cartesian system = " + length);
        return length;
    }

    /*
        USE CASE 2
        As a fan of geometry, I want to check equality of two lines based on the end points, So that I know when two lines are
        the equal.

        - Using Java equals method to check equality of 2 Lengths is preferable.
    */
    public static void areLinesEqual(double len1, double len2){
        String LineA = String.valueOf(len1);
        String LineB = String.valueOf(len2);

        if(LineA.equals(LineB)){
            System.out.println("Length of both lines are equal");
        }else{
            System.out.println("lengths are not equal");
        }
    }

    /*
        USE CASE 3
        As a fan of geometry, I want to compare two lines based on the end points, So that I know if one line is equal, greater or less than the other line.

        - Using Java compareTo method to compare 2 Lengths is preferable.
    */
    public static void greaterEqualOrLessThan(double len1, double len2){
        String LineA = String.valueOf(len1);
        String LineB = String.valueOf(len2);
        int compare = LineA.compareTo(LineB);
        System.out.println("Value returned from compareTo function : " + compare);

        if(compare == 0) {
            System.out.println("Both the Lines are equal");
        } else if(compare > 0) {
            System.out.println("Line 1 is greater then Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}