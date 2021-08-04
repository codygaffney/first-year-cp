/*
 * 
 */
package lab1;
import java.lang.Math;
/**
 *
 * @author Cody Gaffney
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * 1.
         * Write a program that calculates the perimeter of a 
         * rectangle and prints it on the screen. The dimensions 
         * of the rectangle are 165.5 by 102.75. Try to run the 
         * program for other rectangles: 200 by 212, 1.583 by 0.462. 
         */
        
        double num1_1 = 165.5;
        double num1_2 = 102.75;
        
        /**
         * perimeter equals the sum of all sides
         */
        
        double perimeter = (num1_1 * 2) + (num1_2 * 2);
        
        System.out.println("Question 1");
        System.out.println("The perimeter of the " + num1_1 + " x " + num1_2 + " rectangle = " + perimeter);
        
        
        
        /**
         * 2.
         * Write a program that converts temperature in Celsius to 
         * Fahrenheit and prints the result on the screen. Try to 
         * run the program with the following temperatures: 
         * 0, 12, 36.6, 50, 100, 1200. 
         * Write down the results. 
         */
        
        double[] cel_temps = {0,12,36.6,50,100,1200};
        double fahr_temp;
        
        System.out.println("\nQuestion 2");
        
        for(int i = 0; i < cel_temps.length; i++){
            fahr_temp = (cel_temps[i] * (9/5)) + 32;
            System.out.println(cel_temps[i] + " Celsius = " + fahr_temp + " Fahrenheit.");
        }
        
        
        
        /**
         * 3.
         * Now write a program that converts temperature in Fahrenheit 
         * to Celsius and prints the result on the screen. Use results 
         * from the previous program to confirm your program works correctly.	
         */
        
        double[] fahr_temps = {32,44,68.6,82,132,1232};
        double cel_temp;
        
        System.out.println("\nQuestion 3");
        
        for(int i = 0; i < fahr_temps.length; i++){
            cel_temp = (fahr_temps[i] - 32) * (9/5);
            System.out.println(fahr_temps[i] + " Fahrenheit = " + cel_temp + " Celsius.");
        }
        
        
        /**
         * 4.
         * Create a Java program to compute and display the number of days 
         * in the 21st century, which has 25 leap years. 
         */
        
        
        int century = 100;
        int total_days = 0;
        
        for(int i = 1; i <= century; i++){
            if(i%4 == 0){
                total_days += 366;
            }
            else{
                total_days += 365;
            }
        }
        
        System.out.println("\nQuestion 4");
        System.out.println("Total number of days in the 21st century = "+total_days);
        
        
        /**
         * 5.
         * Write a single Java program to calculate the following: 
         * a) The volume of a cylindrical tin of soup of diameter 7cm and 
         * height 10½cm  
         * b) The area of a rectangular wrapper to cover the soup tin of part (A)  
         * c) The total surface area of cling film required to completely wrap 
         * the tin of soup from (A) 
         * 
         * Each section should be separated by a comment. Make sure that 
         * the program is calculating the answer. 
         */
        
        double diameter = 7;
        double radius = diameter / 2;
        double height = 10.5;
        double volume;
        double circumference;
        double rect_area;
        double surface_area;
        
        System.out.println("\nQuestion 5");
        
        //Part A
        
        volume = 3.14 * (radius * radius) * height;
        System.out.println("The volume of the cylinder is " + volume);
        
        //Part B
        
        circumference = 2 * 3.14 * radius;
        rect_area = circumference * height;
        System.out.println("The area of the lable is "+rect_area);
        
        //Part C
        
        surface_area = rect_area + (2 * 3.14 * (radius * radius));
        System.out.println("The surface area of the cylinder is " + surface_area);
        
        
        /**
         * 6.
         * There are four points A, B, C and D.  
         * A’s coordinates are x=-5.5 y=2. 
         * B’s coordinates are x=-3 y=-2.2. 
         * C’s coordinates are x=1 y=2. 
         * D’s coordinates are x=7 y=4.6. 
         * 
         * Write a program that calculates the sum of the following distances: 
         * A to B, B to C, C to D. 
         * Ideally you shouldn’t have to know whether a coordinate is negative 
         * or whether one coordinate has a smaller value than another for your 
         * program to work correctly. 
         */
        
        double ax = -5, ay = 2;
        double bx = -3, by = -2.2;
        double cx = 1, cy = 2;
        double dx = 7, dy = 4.6;
        
        double distAB, distBC, distCD, totalDist;
        distAB = Math.sqrt(((bx-ax)*(bx-ax)) + ((by-ay)*(by-ay)));
        distBC = Math.sqrt(((cx-bx)*(cx-bx)) + ((cy-by)*(cy-by)));
        distCD = Math.sqrt(((dx-cx)*(dx-cx)) + ((dy-cy)*(dy-cy)));
        
        totalDist = distAB + distBC + distCD;
        
        System.out.println("\nQuestion 6");
        System.out.println("The total distance from A to B, B to C and C to D is " + totalDist);
    }
    
}
