package lab2;

import java.util.Scanner;

/**
 *
 * @author Cody Gaffney
 */
public class Lab2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cont = "y";
        
        do{
            System.out.println("\nPick a question:(1-6)");
            String choice = sc.next();
            int choose = 0;
            
            try{
                choose = Integer.parseInt(choice);
            }
            catch(NumberFormatException ex){
                System.out.println("Not a number!");
            }
            
            if(choose == 1){
                
                question1();
                
            }
            else if(choose == 2){
                
                question2();
                
            }
            else if(choose == 3){
                
                question3();
                
            }
            else if(choose == 4){
                
                question4();
                
            }
            else if(choose == 5){
                
                question5();
                
            }
            else if(choose == 6){
                
                question6();
                
            }
            else{
                
                System.out.println("Invalid choice. Continue? (y/n) ");
                cont = sc.next();
                
            }
        }while(cont.toLowerCase() == "y");
        
    }
    
    public static void question1(){
        
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
    }
    
    public static void question2(){
        
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
        
        
        angleABC = Math.toDegrees(Math.acos(((Math.pow( distAB, 2 ))+(Math.pow( distBC, 2 )) -(Math.pow( distCA, 2 ))) / (2 * distAB * distBC)));
        
        
        System.out.println("The angle at B is: "+ angleABC);
        
    }
    
    public static void question3(){
        
        /**
         * 3.
         * Write a program that displays current time in GMT in the format hour:minute:second such as 14:45:19. 
         * The currentTimeMillis method in the System class returns the current 
         * time in milliseconds since the midnight, January 1, 1970 GMT. 
         * (1970 was the year when the Unix operating system was formally introduced.) 
         * You can use this method to compute the current second, minute, and hour. 
         * You should be able to do this without the help of other classes or functions, 
         * only using the regular arithmetic operators. 
         */
        
        int hour, minute, second, ctm;
        String sec = "", min = "", hr = "";
        ctm = (int) System.currentTimeMillis();
        
        
        second = (ctm / 1000 / 60) % 60;
        minute = (ctm / 1000 / 60 / 60) % 60;
        hour = (ctm / 1000 / 60 / 60 / 12) % 12 ;
        
        
        if(second < 10){
            sec = "0" + second;
        }
        else{
            sec = "" + second;
        }
        if(minute < 10){
            min = "0" + minute;
        }
        else{
            min = "" + minute;
        }
        if(hour < 10){
            hr = "0" + hour;
        }
        else{
            hr = "" + hour;
        }
        
        
        System.out.println("\nQuestion 3");
        System.out.println("Time: " + hr + ":" + min + ":" + sec);
        
    }
    
    public static void question4(){
        
        /**
         * Make a program to input an integer and output a message saying 
         * whether the integer is positive, negative or zero. 
         */
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("\nQuestion 4");
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        
        
        if(num < 0){
            System.out.print(num + " is giving negative vibes");
        }
        else{
            System.out.println(num + " is all about those positive vibes");
        }
    }
    
    
    public static void question5(){
        
        /**
         * 5.
         * Write a program that calculates a personâ€™s BMI. The program asks 
         * the user to enter their weight in kg and height in cm and then 
         * displays the calculated BMI as well as which weight class they 
         * belong to. Below 18.5 is underweight, 18.5 to 24.9 is normal, 
         * 25 to 29.9 is overweight and 30 and up is obese. 
         */
        
        Scanner sc = new Scanner(System.in);
        double weight, height;
        
        
        System.out.println("\nQuestion 5");
        System.out.println("Enter your weight (kg): ");
        weight = sc.nextDouble();
        System.out.println("Enter your height (cm): ");
        height = sc.nextDouble();
        
        
        double bmi = (weight / height / height) * 10000;
        
        
        System.out.println("Your BMI is: "+ String.format("%.2f", bmi));
        
        
        if(bmi < 18.5){
            System.out.println("You are underweight.");
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("You bmi is normal.");
        }
        else if(bmi >= 25 && bmi <= 29.9){
            System.out.println("You are overweight.");
        }
        else{
            System.out.println("You are obese.");
        }
        
        
    }
    
    public static void question6(){
        
        /**
         * 6.
         * Write a program that calculates how much tax you need to pay 
         * from your monthly salary. The program should first display a 
         * menu with three options: 
         * Single 
         * Single with child 
         * Married.  
         * 
         * The user selects an option by entering a number between 1 and 3. 
         * After that they enter how much they earned this month. The 
         * program should calculate and display how much tax they will need 
         * to pay. If the user earned less than their tax band, they just 
         * pay 20%. If they earned more than the tax band, the amount 
         * exceeding the tax band is taxed at 40%. The tax bands depend on 
         * the personâ€™s status: Single â‚¬35.300, Single with child â‚¬39.300, 
         * Married â‚¬44.300. Note that the tax bands are given as they apply 
         * to annual income, so must be divided by 12. 
         */
        
        Scanner sc = new Scanner(System.in);
        double tax = 0;
        
        
        System.out.println("Please select (1-3):\n1.Single\n2.Single with Child\n3.Married");
        String choice = sc.next();
        
        
        System.out.println("How much have yu earned this month?");
        double salary = sc.nextDouble();
        
        
        if(choice.equals("1")){
            if(salary > 35300/12){
                tax += ((salary - (35300/12)) * 0.4);
                tax += (35300/12) * 0.2;
            }
            else{
                tax += salary * 0.2;
            }
            System.out.println("You need to pay " + tax + "tax.");
        }
        else if(choice.equals("2")){
            if(salary > 39300/12){
                tax += ((salary - (39300/12)) * 0.4);
                tax += (39300/12) * 0.2;
            }
            else{
                tax += salary * 0.2;
            }
            System.out.println("You need to pay " + tax + "tax.");
        }
        else if(choice.equals("3")){
            if(salary > 44300/12){
                tax += ((salary - (44300/12)) * 0.4);
                tax += (44300/12) * 0.2;
            }
            else{
                tax += salary * 0.2;
            }
            System.out.println("You need to pay " + tax + "tax.");
        }
        else{
            System.out.println("Invalid choice.");
        }
    }
    
}