package base;
public class Main {
    /**
     * In our Assignment here we're running a little lemonade stand and we also sell pretzels. We need to keep track of
     * our inventory as well as the money that we're making throughout the day. I have code in the wet code section that
     * keeps track of all of this poorly. Come up with a better way to manage our system. There's not just one way to do
     * this so get creative and most importantly remember to stay DRY!
     *
     * We're gonna look at the first hour where we have 15 customers!
     *
     * We're responsible for keeping track of the number of pretzels and lemonades sold as well as the cash on hand and
     * in the tip jar! To keep things easy I won't make you make change! At the end of the day tips are split among the
     * employees! That means DON'T add it to the cash at the end of the day or during a transaction
     *
     * At the end we're going to print out our inventory left and how much we made in case for the day! Print out the
     * tips too!
     *
     * Remember to use functions, variables, and whatever else would make this easier to maintain!
     *
     * Pretzels are $2 for 1
     * Lemonade is $8 for 1
     */

    // starting values needed
    static int lemonades_available = 43;
    static int pretzels_available = 60;
    static int cash = 1500;
    static double tips = 0.0;


    // sum of arrays after first hour
    static int sumLemons;
    static int sumPretzels;
    static int sumTip_rec;
    // formula to actively update inventory
    static int netLemons = lemonades_available - sumLemons;
    static int netPretzels = pretzels_available - sumPretzels;


    public static void main(String[] args) {
        //	Replace this with your dry inventory function!
        dry_inventory();
    }
    // array for purchases of pretzels in first hour
    static int pretzelsBought[] = {4,2,3,1,2,10,6,1,2,6,9};
    // formula to find the sum of array above
    static int summationP()
    {
        int sumPretzels = 0;
        int i;
        for (i = 0; i < pretzelsBought.length; i++)
            sumPretzels +=  pretzelsBought[i];
        return sumPretzels;
    }
    // array for the number of lemons used
    static int lemonsUsed[]= {1, 3, 2, 6, 4, 8, 1, 7, 3, 2};
    // formula to find the sum of array above
    static int summationL(){
        int sumLemons = 0;
        int x;
        for (x = 0; x < lemonsUsed.length; x++)
            sumLemons += lemonsUsed[x];
        return sumLemons;
    }
    // array for the number of tips received
    static int tipsReceived[] = {4, 10,5,10,4,3};
    // formula to find the sum of array above
    static int summationT(){
        int sumTip_rec = 0;
        int y;
        for (y = 0; y < tipsReceived.length; y++)
            sumTip_rec += tipsReceived[y];
        return sumTip_rec;
    }

    static void dry_inventory() {
        // Your DRY Solution goes here!
        // formulas used to find the remaining inventory after hour 1
        int netLemons = lemonades_available - summationL();
        int netPretzels = pretzels_available - summationP();
        // total cash after first hour
        int totalCashFlows = cash + (2*summationP()) + (8*summationL());


    System.out.println("Results for the hour!");
    System.out.println("Lemon Inventory: " + netLemons);
    System.out.println("Pretzel Inventory: " + netPretzels);
    System.out.println("Cash: " + totalCashFlows);
    System.out.println("Tips: " + summationT());
    }
}
