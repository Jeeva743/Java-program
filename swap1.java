
import java.util.Arrays;
import java.util.Scanner;

public class swap1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[]= new int [size];
        for (int i = 0; i <size; i++) {
            arr[i]=scan.nextInt(); 
        }
        int left=0;
        int right=size-1;
        while(left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
     System.out.print(Arrays.toString(arr));
    }
    
}

    

