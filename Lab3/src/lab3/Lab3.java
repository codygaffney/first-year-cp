package lab3;

import java.util.Scanner;

/**
 *
 * @author Cody Gaffney
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cont = "y";

        do {

            System.out.println("What question do you want to run?");
            String choice = sc.next();
            
            if(choice.equalsIgnoreCase("1")){
                question1();
            }
            else if(choice.equalsIgnoreCase("2")){
                question2();
            }
            else if(choice.equalsIgnoreCase("3")){
                question3();
            }
            else if(choice.equalsIgnoreCase("4")){
                question4();
            }
            else if(choice.equalsIgnoreCase("5")){
                question5();
            }
            else{
                System.out.println("Do you want to continue?");
            }

        } while (cont.equalsIgnoreCase("y"));

    }

    public static void question1() {
        
        System.out.println("\nQuestion 1");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a single alphabetic character: ");
        String ch = sc.next();
        
        String[] consonants = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
        String[] vowels = {"a","e","i","o","u"};
        boolean isConsonant = false;
        boolean isVowel = false;
        
        for(int i = 0; i < consonants.length; i++){
            if(ch.equalsIgnoreCase(consonants[i])){
                isConsonant = true;
            }
        }
        
        for(int i = 0; i < vowels.length; i++){
            if(ch.equalsIgnoreCase(vowels[i])){
                isVowel = true;
            }
        }
        
        if(isConsonant == true){
            System.out.println(ch + " is a consonant.");
        }
        else if(isVowel == true){
            System.out.println(ch + " is a vowel.");
        }
        else{
            System.out.println(ch + " is not an alphabetic character.");
        }
        
        

    }

    public static void question2() {

    }

    public static void question3() {

    }

    public static void question4() {

    }

    public static void question5() {

    }

}
