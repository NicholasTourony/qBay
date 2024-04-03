public class Item
{
    String name;
    String category;
    double price;
    User seller;

    public Item(String name, String category, double price, User seller)
    {
        this.name = name;
        this.category = category;
        this.price = price;
        this.seller = seller;
    }
}