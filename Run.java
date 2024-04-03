import java.util.Scanner;
public class Run
{

   
    public static void main(String[] args)
    {
        User nick = new User("Nicholas Tourney", "Nicholas.Tourney@gmail.com", "Nick", "night1");
        User dawit = new User("Dawit Kasy", "Dawit.Kasy@gmail.com", "Dawit", "computer2");
        User jeremy = new User("Jeremy Wiening", "Jeremy.Wiening@gmail.com", "Jeremy", "science1");
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
            if(nick.correctLogin(username, password) || dawit.correctLogin(username, password) || jeremy.correctLogin(username, password))
            {
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


        
        System.out.println("what would you like to do\n1.Buy\n2.Sell\n3.Cart ");
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