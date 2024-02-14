/** Osman Goni Rifat
 * CIS 210-0900
 * Homework 2
 * Due 9/27/23
 */
import java.util.ArrayList;
public class Hw2 {
    public static void main(String[] args) {
        //Create two-dimensional array
        double[][] doubleArray = {{-20, 100, 600}, {5, 6, 7}};

        //Print out the values using a loop
        System.out.println("Values in the array: ");

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println(doubleArray[row][col] + " ");
            }
        }
        //Create and arraylist
        ArrayList<String> friends = new ArrayList<>();

        // Add 3 friends
        friends.add("Ismail");
        friends.add("Shamim");
        friends.add("Sagor");

        //Print out values using loop
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
    }
}

