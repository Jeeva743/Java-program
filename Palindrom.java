
import java.util.Scanner;

public class Palindrom{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        sb.append(s);

        if(s.equals(sb.reverse().toString())){
            System.out.println("The given string is Palindrom: "+"BeforeReverse: "+s + " "+ "AfterReverse: "+sb.toString());
        }else{
            System.out.println("Given string is not palindrom: "+"BeforeReverse: "+s + " "+ "AfterReverse: "+sb.toString());
        }

    }
}
