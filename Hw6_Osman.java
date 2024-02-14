/**
 * Osman Goni Rifat
 * CIS 210-0900
 * Professor Colin Persaud
 * Homework 6
 * Due 10/27/23 by Midnight
 * */
import java.util.Scanner;

public class Hw6_Osman {
    public static void main(String[]args){
        //Declare variables
        String userName;

        //Create scanner obj
        Scanner keyboard= new Scanner(System.in);

        //Ask for user input
        System.out.println("Enter your name: ");
        userName=keyboard.nextLine();

        //Crete stringbuilder obj
        StringBuilder stringBuilder=new StringBuilder(userName);

        //Insert data
        stringBuilder.insert(0, "CSC210 Section 0900 ");

        //Output
        System.out.println("New value: "+stringBuilder);


    }
}
