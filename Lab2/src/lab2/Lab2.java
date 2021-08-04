package lab2;

import java.util.Scanner;

/**
 *
 * @author Cody Gaffney
 */
public class Lab2 {

    public static void main(String[] args) {
        
        /**
         * 1.
         * Write a program that first asks the user to enter diameter 
         * and then height of a cone. The program should then calculate 
         * and display volume and total surface area of the given cone. 
         */
        
        Scanner sc1 = new Scanner(System.in);
        
        double diameter1, height1, volume1, surfaceArea1, radius1;
        
        System.out.println("Question 1");
        
        System.out.println("Enter the diameter of the cone: ");
        diameter1 = sc1.nextInt();
        
        System.out.println("Enter the height of the cone: ");
        height1 = sc1.nextInt();
        
        radius1 = diameter1 / 2;
        volume1 = Math.PI * Math.pow( 2 , radius1) * (height1 / 3);
        surfaceArea1 = Math.PI * radius1 * (radius1 + Math.sqrt( Math.pow( height1, 2 )+Math.pow( radius1, 2 )));
        
        System.out.println("The volume of the cone is " + String.format("%.2f", volume1) + ". The surface area of the cone is " + String.format("%.2f", surfaceArea1));
        
        
        
        /**
         * 2.
         * Write a program that asks the user to enter x and y coordinates 
         * of three points (A,B,C). The program should then calculate the 
         * angle between them (point B). You can use the Law of Cosines or 
         * try a different approach. 
         */
        
        Scanner sc2 = new Scanner(System.in);
        
        double Ax, Ay, Bx, By, Cx, Cy, distAB, distBC, distCA, angleABC;
        
        System.out.println("\nQuestion 2");
        
        System.out.println("Please enter a point for Ax: ");
        Ax = sc2.nextDouble();
        System.out.println("Please enter a point for Ay: ");
        Ay = sc2.nextDouble();
        System.out.println("Please enter a point for Bx: ");
        Bx = sc2.nextDouble();
        System.out.println("Please enter a point for By: ");
        By = sc2.nextDouble();
        System.out.println("Please enter a point for Cx: ");
        Cx = sc2.nextDouble();
        System.out.println("Please enter a point for Cy: ");
        Cy = sc2.nextDouble();
        
        distAB = Math.sqrt(Math.pow((Bx-Ax), 2) + Math.pow((By-Ay), 2));
        distBC = Math.sqrt(Math.pow((Cx-Bx), 2) + Math.pow((Cy-By), 2));
        distCA = Math.sqrt(Math.pow((Ax-Cx), 2) + Math.pow((Ay-Cy), 2));
        
        angleABC = Math.acos(((Math.pow( distAB, 2 ))+(Math.pow( distBC, 2 )) -(Math.pow( distCA, 2 )))/( 2 * distAB * distBC ));
        
        System.out.println("The angle at B is: "+ angleABC);
        
    }
    
}



/**
 * +--------------------+
 * |
 */