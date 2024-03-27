import java.util.ArrayList;

public class User 
{
    String name;
    String email;
    String username;
    String password;
    ArrayList<Item> cart = new ArrayList<Item>();
    ArrayList<Item> itemsForSale = new ArrayList<Item>();

    public User(String name, String email, String username, String password)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public boolean correctLogin(String username, String password)
    {
        return username.equals(this.username) && password.equals(this.password);
    }

    public void addItemToCart(Item item)
    {
        cart.add(item);
    }

    public void removeItemToCart(Item item)
    {
        cart.remove(item);
    }

    public void addItemForSales(Item item)
    {
        itemsForSale.add(item);
    }

    public void removeItemForSales(Item item)
    {
        itemsForSale.remove(item);
    }
}
