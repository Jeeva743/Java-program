 import java.util.Scanner;
public class practice {
   

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int days = scan.nextInt();
        int years = 0;
        int months = 0;
        int weeks = 0;
        int hours = 0;
        int remainingdays = days;
        while(remainingdays>=365){
            years++;
            remainingdays-=365;
        }
        
            while(remainingdays>=30){
                months++;
                remainingdays-=30;
            }
            while(remainingdays>=7) {
                weeks++;
                remainingdays-=7;

            }
            while(remainingdays>=1) {
                hours++;
                remainingdays-=1;
            }
            System.out.println("years "+years);
        System.out.println("months "+months);
        System.out.println("weeks "+ weeks);
        System.out.println("hours "+hours);
        System.out.println("days "+remainingdays);
        }
       
    }

        


    
    



