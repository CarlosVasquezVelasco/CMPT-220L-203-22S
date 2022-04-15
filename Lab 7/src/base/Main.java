package base;

public class Main {
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        first.nextNode = second;
        second.lastNode = first;
        third.nextNode = fourth;
        fifth.lastNode = fourth;

        listItem listItem = new listItem();
        Node item = new Node(4);
        listItem.setvalue(2);
        listItem.setlistItem(item);
        Node item2 = new Node(5);
        Node item3 = new Node(6);
        Node item4 = new Node(7);
        item.nextNode = item2;
        item2.nextNode = item3;
        item3.nextNode = item4;
        item4.lastNode = item3;


    }

    }
