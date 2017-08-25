import java.util.Scanner;

/**
 * Created by ihor on 24.8.17.
 */
public class Solution4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("NOD="+NOD(x,y));
        System.out.println("NOK="+x*y/NOD(x,y)); //прямая зависимость НОД и НОК
    }
    private static int NOD(int a, int b) {
        if (b == 0)
            return a;
        return NOD(b, a % b);
    }




}
