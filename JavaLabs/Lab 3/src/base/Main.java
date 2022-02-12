package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        if (true) {
            System.out.println("If statement triggered a println statement");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        if (!true) {
            System.out.println("First half of statement triggered by an if not true clause");
        } else {
            System.out.println("Second half of statement triggered by an else clause");
        }
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        if (!true) {
            System.out.println("Not true");
        } else if (!true){
            System.out.println("true");
        } else {
            System.out.println("else statement triggered a println statement");
        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        boolean strawberry = true;
        boolean banana = false;
        if (strawberry && !banana) {
            System.out.println("I can make a strawberry banana crepe");
        }
        else {
            System.out.println("whoops");
        }

        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        boolean tennis = true;
        boolean soccer = false;
        if (tennis && !soccer) {
            System.out.println("I play both soccer and tennis");
        }
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        boolean pancakes = true;
        boolean waffles = false;
        if (pancakes || waffles) {
            System.out.print("I can make pancakes or waffles");
            }
        }
    }

