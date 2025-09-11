public class loop {
    public static void main(String[] args) {
            int num = 1;
        for (int i= 1; i <= 4; i++) {
           
            for (int j = 1; j<= i; j++) {
                int a = num%10;
                System.out.print(a);
                num++;

            }
            System.out.println(); 
       }    }
}
    


