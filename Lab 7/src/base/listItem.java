package base;

public class listItem {
    int value;
    Node listItem;

    public void setvalue(int newValue)
    {
        value = newValue;
    }

    public void setlistItem(Node newListItem)
    {
        this.listItem = newListItem;
    }

    public int getValue()
    {
        return(value);
    }

    public Node getItem()
    {
        return (listItem);
    }

}
