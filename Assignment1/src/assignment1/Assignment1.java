/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Tomas
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] lottoNums = pickNums();
        printNums(lottoNums);
        int sum = getTotal(lottoNums);
        int bonusPrize = bonusGame();

    }
    
    private static int[] pickNums(){
        Random rand = new Random();

        int[] lottoNums = new int[10];

        boolean isPresent = false;

        for (int i = 0; i < lottoNums.length; i++) {
            lottoNums[i] = rand.nextInt(99) + 1;
            if (i > 0) {
                do {
                    isPresent = false;
                    for (int j = 0; j < i; j++) {
                        if (lottoNums[i] == lottoNums[j]) {
                            isPresent = true;
                            lottoNums[i] = rand.nextInt(99) + 1;
                        }
                    }
                } while (isPresent);
            }
        }
        Arrays.sort(lottoNums);
        return lottoNums;
    }
    
    private static void printNums(int[] lottoNums){
        
        for (int i = 0; i < lottoNums.length; i++) {
            if(lottoNums[i] < 10){
                System.out.print("0"+lottoNums[i] + " ");
            }
            else{
                System.out.print(lottoNums[i] + " ");
            }
            
        }
        System.out.println();
        
    }
    
    private static int getTotal(int[] lottoNums){
        int sum = 0;
        for(int i = 0; i < lottoNums.length; i++){
            sum += lottoNums[i];
        }
        System.out.println("The sum of the lotto numbers is: "+sum);
        return sum;
    }
    
    private static int bonusGame(){
        Random rand = new Random();
        int bonusGame = 0;
        int percentage;
        int[] bonusArr = new int[4];
        for(int i = 0; i < bonusArr.length;i++){
            percentage = rand.nextInt(99) + 1;
            if(percentage <= 50){
                bonusArr[i] = 10;
            }
            else if(percentage > 50 && percentage <= 77){
                bonusArr[i] = 20;
            }
            else if(percentage > 77 && percentage <= 92){
                bonusArr[i] = 50;
            }
            else if(percentage > 92 && percentage <=98){
                bonusArr[i] = 200;
            }
            else{
                bonusArr[i] = 1000;
            }
        }
        
        for(int i = 1; i < bonusArr.length;i++){
            for(int j = 0; j < i; j++){
                if(bonusArr[i] == bonusArr[j]){
                    bonusGame=bonusArr[i];
                }
            }
        }
        printNums(bonusArr);
        return bonusGame;
    }

}
