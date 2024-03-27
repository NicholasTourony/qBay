import java.util.ArrayList;

public class User 
{
    String name;
    String email;
    String username;
    String password;
    ArrayList<Item> cart = new ArrayList<Item>();


    public User(String name, String email, String username, String password)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public void addItem(Item item)
    {
        cart.add(item);
    }

    public void removeItem(Item item)
    {
        cart.remove(item);
    }
}
