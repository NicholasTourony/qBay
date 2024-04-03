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
        User nick = new User("Nicholas Tourney", "Nicholas.Tourney@gmail.com", "Nick", "night1");
        User dawit = new User("Dawit Kasy", "Dawit.Kasy@gmail.com", "Dawit", "computer2");
        User jeremy = new User("Jeremy Wiening", "Jeremy.Wiening@gmail.com", "Jeremy", "science1");
    
        Item item1 = new Item("Intro to Discrete Math", "Used Textbook", 50.00, dawit);
        Item item2 = new Item("Sweatshirt", "Clothing", 30.00, nick);
        Item item3 = new Item("Macbook", "Electronic", 1200.00, jeremy);
        Item item4 = new Item("Intro to French", "Used Textbook", 60.00, dawit);
        Item item5 = new Item("Quinnipiac Cap", "Clothing", 20.00, nick);
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome\nPlease enter your username:");
        String username = scan.nextLine();
        System.out.println("Please enter your password.");
        String password = scan.nextLine();

        
        System.out.println("what would you like to do\n1.Buy\n2.Sell\n3.Cart ");
        int option = scan.nextInt();
        if(option == 1){
            itemDisplay();
            int item = scan.nextInt();
            if(item == 1){
                System.out.println("Would you like to\n1.Add item to cart\n2.See more information");
                int decision = scan.nextInt();// asking if they want to add item to cart
                if(decision == 1){
                    addItemToCart(item1);
                }
            }
        }else if (option == 2){
            sell();
        }else if( option == 3){
            cart();     
        } else{
            System.out.println("Not a valid option");
        }

    }

}
}