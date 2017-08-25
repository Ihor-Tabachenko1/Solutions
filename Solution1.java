import java.util.Scanner;

/**
 * Created by ihor on 23.8.17.
 */
public class Solution1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int i;
        boolean result = false;
            for (i = 2; i < num; i++){
                if ( num % i == 0){
                    result = false;
                    break;
                    }
                else result = true;
        }
        if (result)  System.out.println("Prime number");
        else         System.out.println("Compound number");
        }
}
