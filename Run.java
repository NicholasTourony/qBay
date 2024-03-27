import java.util.Scanner;
public class Run
{
    public void buy(){
        
    }

    public static void main(String[] args)
    { Scanner scan = new Scanner(System.in);
    
        System.out.println("what would you like to do\n 1.Buy\n2.Sell\n3.Cart ");
        int option = scan.nextInt();
        if(option == 1){
            buy();
        }else if (option == 2){
            sell();
        }else if( option == 3){
            cart();     
        } else{
            System.out.println("Not a valid option");
        }

    }
}