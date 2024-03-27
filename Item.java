public class Item
{
    String name;
    String category;
    String price;
    User seller;

    public Item(String name, String category, String price, User seller)
    {
        this.name = name;
        this.category = category;
        this.price = price;
        this.seller = seller;
    }
}