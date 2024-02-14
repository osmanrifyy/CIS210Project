/** Osman Goni Rifat
 * CIS 210-0090
 * Homework 1
 * Due Wednesday.
 */


public class Hw1 {
    public static void main(String[]args){
        //Declare variables
        double[] number= new double[10];
        double sum=0;
        //Assign value 1 to 10 using loop
        for(int i=0; i<number.length;i++){
            number[i]=i+1;
        }
        //Using a loop to output the value
        for(int i=0; i<number.length;i++){
            System.out.println(number[i]);
        }

        //Calculate and output the sum
        for (int i=0; i<number.length; i++){
            sum+=number[i];
        }
        //Output sum
        System.out.println("The sum is: "+sum);
    }
}
