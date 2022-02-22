package base;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /**
     * # Lab Four
     * ---
     * <p>
     * For this lab we're going to be making and using a bunch of functions.
     * <p>
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        int [] array = {2,3,5,2,3,6,7,8,2};
        int sum_count = number_counter(array, 2);
        System.out.println("Exponent " + exponent(2,3));
        System.out.println("Pythagoream " + pythagoream(2,3));
        System.out.println("Summation " + summation());

        // Give me an example of you using switch case.

        String starter = "Blue";

        switch (starter) {
            case "Blue":
                System.out.println("Blue is one of my favorite colors");
            case "Red":
                System.out.println("Red is one of the colors of my school");
            case "White":
                System.out.println("White is the second color of my school");
            default:
                System.out.println("What is a fact about a color?");
        }

        // Give me an example of you using a for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }

        // Give me an example of you using a while loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;

        }
        System.out.println("The number is repeated " + sum_count + " times in the array");
    }

    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
     static double exponent(int base, int power){
         return Math.pow(2,3);
    }


        /**
         * I want you to write a function that will take in a list and see how many times a given number is in the list.
         * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
         * or return 3. Print the output.
         */

    static int number_counter (int[] array,int search){

        if (array.length == 0) {
            System.out.println("Empty array.");
            return array.length;
        }
        else{
            int sum_count = 0;
            for (int number : array) {

                    sum_count++;

            }
            return sum_count;
        }

    }


        /**
         * Create a function named summation that will take in an int[ ] and return an int.
         * I want the function to then go through the given array and sum up digits in the array.
         * Once that’s done print or return the answer. Print the output
         */
    static int arr[] = {12,3,4,15};

    static int summation()
    {
        int sum = 0;
        int i;

        for (i = 0; i < arr.length; i++)
            sum +=  arr[i];
        return sum;
    }

        /**
         * Give me a function that gives the answer to the pythagorean theorem.
         * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
         *
         * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
         * Given a and b as parameters i'd like you to return c.
         *
         * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
         *
         * Once that’s done print or return the answer. Print the output
         */
    double addition (int a, int b){
        int answer = a + b;
        return answer;
    }

    double division (int a, int b){
        int answer = a / b;
        return answer;
    }

    static double pythagoream (int a,int b){
        double a_squared = exponent(a, 2);
        double b_squared = exponent(b, 2);
        double c_squared = (a_squared + b_squared);
        double c = Math.sqrt(c_squared);
        return c;

    }


}




