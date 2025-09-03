 import java.util.Scanner;
public class test {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=scan.nextLine();
        System.out.println("enter your score:");
        float score=scan.nextInt();
        scan.nextLine();
        System.out.println("enter department:");
        String dept=scan.nextLine();
        float a=score/10;
        System.out.println("My name is "+name);
        System.out.println("My score is "+a);
        System.out.println("My department name is "+dept);
    
    }
    
}

    

