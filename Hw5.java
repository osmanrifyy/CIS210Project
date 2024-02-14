/**
 * Osman Goni Rifat
 * CIS 210-0900
 * HOMEWORK #5
 * DUE BY 10/27/23 BY MIDNIGHT
 */

import java.util.Scanner;

public class Hw5 {
    public static void main(String[]args) {
        //Declare variable
        String userInput;


        //Create a scanner class for input
        Scanner keyboard = new Scanner(System.in);

        //Get user input
        System.out.println("Enter a string for check: ");
        userInput = keyboard.nextLine();
        //Call method
        checkDigit(userInput);
    }
        //Create method
        public static void checkDigit(String say){
            String check="Digit not found";
            for(int i=0; i<say.length();i++){
                if(Character.isDigit(say.charAt(i))){
                    check="Digit found";
                }
            }
            System.out.println(check);
    }
}


