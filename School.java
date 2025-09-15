
    import java.util.Scanner;

public class School {
    String passorfail(int Score){
       if (Score >=35){
        return "pass" ;
    }
    else {
        return "Fail";
    }
    
}

     public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.print("Enter Your Score: ");
    int total = s1.nextInt();
    School obj=new School();
    String score = obj.passorfail(total);
    System.out.println(score);


}}


