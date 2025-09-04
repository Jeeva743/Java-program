
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamil = scan.nextInt();
        int english = scan.nextInt();
        int maths = scan.nextInt();
        int science = scan.nextInt();
        int social = scan.nextInt();
        int d = tamil+english+maths+science+social;
        int e = d/5;
        System.out.println("The avg of e is: "+e);
        if(e<35){
            System.out.println("you need additional class");
        }
        else{
            System.out.println("you good to go");
        }
    }
    
}
