import java.util.Scanner;
public class Switch {
        public static void main(String[]args){
	    Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
	    char choice=scan.next().charAt(0);
        switch(choice){
            case 'A': System.out.println("Withdraw"); break;
            case 'B': System.out.println("Deposit"); break;
            case 'C': System.out.println("Balance Check"); break;
            default: System.out.println("Please enter A-C");
        }
        
	}
}



