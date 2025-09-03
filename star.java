
import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =n;i>=1;i--){
            for(int i1 =i;i1>=1;i1--)
            System.out.print("*");
            
           System.out.println();
            }
            System.out.println("FINISHED..!!");
         scan.close();
    }
    
}

    

