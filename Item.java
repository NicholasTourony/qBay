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

    public void printItemAndPrice()
    {
        System.out.println("Item: " + name + " Price: $" + price);
    }

    public void printItemCategoryAndPrice()
    {
        System.out.println("Item: " + name + "Category: " + " Price: $" + price);
    }

    public void printItem()
    {
        System.out.println("Item: " + name + " Category: " + category + " Seller: " + seller.name + " Seller Email: " + seller.email +  " Price: $" + price);
    }
}