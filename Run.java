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
    }
}