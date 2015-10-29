import java.io.*;
import java.util.Scanner;

public class derivCalc {
    public static void main(String[] args) {
        
        System.out.println("Given the amount of fencing material, what is the largest possible area?");
        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");
        
        Scanner fence = new Scanner(System.in);
        System.out.print("How much fencing material do you have (yards)? ");
        double perim = fence.nextDouble();
        System.out.println();
        
        System.out.print("How many sides do you have to border (up to 4) ");
        int sides = fence.nextInt();
        System.out.println();
        
        double maxArea = 0;
        double side1 = 0;
        double side2 = 0; /*rectangular, parallel sides*/
        double deriv = 0;
        
        if (sides == 2) {
            side1 = perim / 2;
            side2 = side1;
            
            maxArea = side1 * side2;
        }
        else if (sides == 3) {
            side2 = perim - (2 * (perim / 4));
            side1 = side2 / 2;
            
            maxArea = side1 * (perim - 2 * (side1));
        }
        else if (sides == 4) {
            side1 = perim / 4;
            side2 = side1;
            
            maxArea = side1 * side2;
        }
        
        System.out.println("With " + perim + " yards of fencing material: ");
        System.out.print("A rectangle " + side1 + " x " + side2 + " yards produces the maximum");
        System.out.println(" area of " + maxArea + " square yards.");
    }
}