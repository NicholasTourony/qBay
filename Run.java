import java.util.Scanner;
public class Run
{




    public static void itemDisplay(){
        System.out.println("Items for Sale\n===============\n1.Intro to Discrete Math");
        System.out.println("2.Sweatshirt");
        System.out.println("3.Macbook");
        System.out.println("4.Intro to French\n5.Quinnipiac Cap\nPlease choose an item");
    }

   

    public static void main(String[] args)
    {
        User signedInUser = null;

        User nick = new User("Nicholas Tourney", "Nicholas.Tourney@gmail.com", "Nick", "night1");
        User dawit = new User("Dawit Kasy", "Dawit.Kasy@gmail.com", "Dawit", "computer2");
        User jeremy = new User("Jeremy Wiening", "Jeremy.Wiening@gmail.com", "Jeremy", "science1");

    
        Item item1 = new Item("Intro to Discrete Math", "Used Textbook", 50.00, dawit);
        Item item2 = new Item("Sweatshirt", "Clothing", 30.00, nick);
        Item item3 = new Item("Macbook", "Electronic", 1200.00, jeremy);
        Item item4 = new Item("Intro to French", "Used Textbook", 60.00, dawit);
        Item item5 = new Item("Quinnipiac Cap", "Clothing", 20.00, nick);

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");

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
        
        System.out.println("what would you like to do\n1.Buy\n2.Sell\n3.Cart\n4.Logout");
        int option = scan.nextInt();
        if(option == 1){
            itemDisplay();
            int item = scan.nextInt();
            if(item == 1){
                System.out.println("Would you like to\n1.Add item to cart\n2.See more information");
                int decision = scan.nextInt();// asking if they want to add item to cart
                if(decision == 1){
                    signedInUser.addItemToCart(item1);
                }
            }
        }else if (option == 2){
            // sell option
            int selection = 0;
            while (selection != 1 || selection != 2)
            {
                System.out.println("Would you like to see your current items for sale (1) or add a new item to sell (2)");
                selection = scan.nextInt();

                if (selection == 1)
                {
                    signedInUser.printItemsForSale();
                }
                else if (selection == 2)
                {
                    
                }
            }
            
        }else if( option == 3){
            //cart();     
        } 
else if( option == 4){
            System.out.println("Logging out...");
            System.exit(0);
        }else{
            System.out.println("Not a valid option");
        }
    }
}