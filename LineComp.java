import java.util.Scanner;
public class LineComp {
    public static void main(String[] args) {
        // USE CASE 1 - Welcome Message
        System.out.println("Welcome to the Line Comparison Problem");

        // USE CASE 1 - Length of the Line
        lengthOfLine();
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
    public static void lengthOfLine(){
    int x1, x2, y1, y2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of x1 :");
    x1 = sc.nextInt();
    System.out.println("Enter the value of y1 :");
    y1 = sc.nextInt();
    System.out.println("Enter the value of x2 :");
    x2 = sc.nextInt();
    System.out.println("Enter the value of y2 :");
    y2 = sc.nextInt();
    double length = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
    System.out.println("The length of a line using cartesian system = " + length);
    }
}
