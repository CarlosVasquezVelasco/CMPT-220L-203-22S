package base;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Stack;
public class Main {

    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */

    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        String[] soccerA = {"ManCity", "ManUtd", "Chelsea", "Liverpool", "Barcelona", "RealMadrid"};
        System.out.println((Arrays.toString(soccerA)));
        // Create an ArrayList, Populate it, and Print it out
        ArrayList<String> soccerTeams = new ArrayList<String>();
        soccerTeams.add("ManCity");
        soccerTeams.add("ManUtd");
        soccerTeams.add("Chelsea");
        soccerTeams.add("Liverpool");
        soccerTeams.add("Barcelona");
        soccerTeams.add("RealMadrid");
        System.out.println(soccerTeams);
        // Create an LinkedList, Populate it, and Print it out
        LinkedList<String> basketballTeams = new LinkedList<String>();
        basketballTeams.add("Boston Celtics");
        basketballTeams.add("New York Knicks");
        basketballTeams.add("LA Lakers ");
        basketballTeams.add("OKC Thunder");
        basketballTeams.add("Miami Heat");
        System.out.println(basketballTeams);
        // Create an Queue, Populate it, and Print it out
        Queue<String> animals = new LinkedList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Lizards");
        animals.add("Rabbits");
        System.out.println(animals);
        // Create an Stack, Populate it, and Print it out
        Stack<String> colors = new Stack<String>();
        colors.push("Red");
        colors.push("Blue");
        colors.push("Grey");
        colors.push("Black");
        System.out.println(colors);

        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Main Plant = new Main(true, true, 15, 2, true);
        System.out.println("Weight: " + Plant.weight);
        System.out.println("Height: " + Plant.height);
    }
    boolean photosynthetic;
    boolean hasChlorophyll;
    Integer height;
    Integer weight;
    boolean hasRoots;
    public Main(boolean photosynthetic, boolean hasChlorophyll, Integer height, Integer weight, boolean hasRoots){
        this.photosynthetic = true;
        this.hasChlorophyll = true;
        this.height = height;
        this.weight = weight;
        this.hasRoots = true;
    }
}



