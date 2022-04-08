package base;

public class Main {
    public static void main(String[] args){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        first.nextNode = second;
        second.lastNode = first;
        third.nextNode = fourth;
        fifth.lastNode = fourth;
        second.doubleNode = fourth;
        first.doubleNode = second;

    }

}

