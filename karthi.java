import java.util.Scanner;

public class karthi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = scan.nextInt();
        if(age>=18){
            System.out.println("You Are Eligible to Vote");
        }
        else{
            System.out.println("You Are Not Eligible to Vote");
        }



    }

}
