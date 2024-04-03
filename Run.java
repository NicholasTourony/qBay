import java.util.Scanner;
public class Run
{

    User nick = new User("Nicholas Tourney", "Nicholas.Tourney@gmail.com", "Nick", "night1");
    User dawit = new User("Dawit Kasy", "Dawit.Kasy@gmail.com", "Dawit", "computer2");
    User jeremy = new User("Jeremy Wiening", "Jeremy.Wiening@gmail.com", "Jeremy", "science1");
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome\nPlease enter your username:");
        String username = scan.nextLine();
        System.out.println("Please enter your password.");
        String password = scan.nextLine();

        
        System.out.println("what would you like to do\n 1.Buy\n2.Sell\n3.Cart ");
        int option = scan.nextInt();
        // if(option == 1){
        //     buy();
        // }else if (option == 2){
        //     sell();
        // }else if( option == 3){
        //     cart();     
        // } else{
        //     System.out.println("Not a valid option");
        // }

    }

    
}