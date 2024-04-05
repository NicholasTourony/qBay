import java.util.ArrayList;
import java.util.Scanner;
public class Run
{




    public static void itemDisplay(ArrayList<Item> itemsDisplay){
        for (int count = 0; count < itemsDisplay.size(); count++){
           System.out.print((count+1)+". "); itemsDisplay.get(count).printItemName();               
        }
    }

    public static void main(String[] args)
    {
        User signedInUser = null;

        User nick = new User("Nicholas Tourney", "Nicholas.Tourney@gmail.com", "Nick", "night1");
        User dawit = new User("Dawit Kasy", "Dawit.Kasy@gmail.com", "Dawit", "computer2");
        User jeremy = new User("Jeremy Wiening", "Jeremy.Wiening@gmail.com", "Jeremy", "science1");

        ArrayList<Item> itemsDisplay = new ArrayList<Item>();
    
        Item item1 = new Item("Intro to Discrete Math", "Used Textbook", 50.00, dawit);
        dawit.addItemForSales(item1);
        itemsDisplay.add(item1);
        Item item2 = new Item("Sweatshirt", "Clothing", 30.00, nick);
        nick.addItemForSales(item2);
        itemsDisplay.add(item2);
        Item item3 = new Item("Macbook", "Electronic", 1200.00, jeremy);
        jeremy.addItemForSales(item3);
        itemsDisplay.add(item3);
        Item item4 = new Item("Intro to French", "Used Textbook", 60.00, dawit);
        dawit.addItemForSales(item4);
        itemsDisplay.add(item4);
        Item item5 = new Item("Quinnipiac Cap", "Clothing", 20.00, nick);
        itemsDisplay.add(item5);
        nick.addItemForSales(item5);

        Scanner scan = new Scanner(System.in);

        System.out.println("                \n/  \\    /  \\ ____ |  |   ____  ____   _____   ____  \n\\   \\/\\/   // __ \\|  | _/ ___\\/  _ \\ /     \\_/ __ \\ \n \\        /\\  ___/|  |_\\  \\__(  <_> )  Y Y  \\  ___/ \n  \\__/\\  /  \\___  >____/\\___  >____/|__|_|  /\\___  >\n       \\/       \\/          \\/            \\/     \\/ ");

        int checks = 1;
        boolean correctLogin = false; 
        while(checks <= 3)
        {
            System.out.println("Please enter your username:");
            String username = scan.nextLine();
            System.out.println("Please enter your password.");
            
            String password = scan.nextLine();
            if(nick.correctLogin(username, password))
            {
                signedInUser = nick;
                System.out.println("Welcome " + username);
                correctLogin = true;
                break;
            }
            else if(dawit.correctLogin(username, password))
            {
                signedInUser = dawit;
                System.out.println("Welcome " + username);
                correctLogin = true;
                break;
            }
            else if(jeremy.correctLogin(username, password))
            {
                signedInUser = jeremy;
                System.out.println("Welcome " + username);
                correctLogin = true;
                break;
            }
            else
            {
                System.out.println("Incorrect username or password");
            }
            checks++;
        }

        if(correctLogin == false)
        {
            System.out.println("3 incorrect login attempts, you are locked out!");
            System.exit(0);
        }
        while (true){
            System.out.println("what would you like to do\n1.Buy\n2.Sell\n3.Cart\n4.Logout");
            int option = scan.nextInt();
            scan.nextLine();
            if(option == 1){
                System.out.println("Please select an item:");
                itemDisplay(itemsDisplay);
                int item = scan.nextInt();
                scan.nextLine();
                
               System.out.println("Would you like to\n1.Add item to cart\n2.See more information\n3.Return to main Menu");
               int decision = scan.nextInt();// asking if they want to add item to cart
               scan.nextLine();
                   if(decision == 1){
                   signedInUser.addItemToCart(itemsDisplay.get(item-1));
                    } else if (decision == 2){
                    itemsDisplay.get(item-1).printItem();
                    System.out.println("Would You like to add Item to cart(1)");
                        int add = scan.nextInt();
                        if(add == 1){
                            signedInUser.addItemToCart(itemsDisplay.get(item-1));
                        }
                    }
                    if(decision == 3){
                        
                    }
                    
                
            }else if (option == 2){
                // sell option
                int selection = 0;
                while (selection != 1 || selection != 2)

                {
                    System.out.println("Would you like to see your current items for sale (1), add a new item to sell (2), or back to the main menu (3)");
                    selection = scan.nextInt();
                    scan.nextLine();
    
                    if (selection == 1)
                    {
                        signedInUser.printItemsForSale();
                    }
                    else if (selection == 2)
                    {
                        String name;
                        String category;
                        double price;
                        System.out.print("Enter the item name: ");
                        name = scan.nextLine();
                        System.out.print("Enter the item category: ");
                        category = scan.nextLine();
                        System.out.print("Enter the price: ");
                        price = scan.nextInt();
                        scan.nextLine();
                        Item newItem = new Item(name, category, price, signedInUser);
                        signedInUser.addItemForSales(newItem);
                        itemsDisplay.add(newItem);
                    }
                    else if (selection == 3)
                    {
                        break;
                    }
                }
            }else if( option == 3){
                System.out.println("Would you like to checkout?\nYes or No");
                signedInUser.printCart();
                double cartPrice = signedInUser.getCartPrice();
                String checkout = scan.nextLine();
                
                if(checkout.equals("Yes"))
                {
                    System.out.println("Your total is: $" + cartPrice + "\nThank you for shopping with qBay!");
                    ArrayList<Item> cart = signedInUser.cart;
                    for(int x = 0; x < cart.size(); x++)
                    {
                        itemsDisplay.remove(cart.get(x));
                    }
                    signedInUser.cart = new ArrayList<Item>();
                }
                else if(checkout.equals("No"))
                {
                    
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }else if( option == 4){
                System.out.println("Thank you for using qBay!!!\nLogging out...");
                System.exit(0);
            }else{
                System.out.println("Not a valid option");
            }
        }
    }
}
