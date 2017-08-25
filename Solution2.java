import java.util.Scanner;

/**
 * Created by ihor on 23.8.17.
 */
public class Solution2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int a = 1;
        int b = 1;
        int f = 0;
        System.out.println(a);
        System.out.println(b);  //для вывода двух первых чисел Фибоначчи

        while (f < num) {
            f = a + b;
            a = b;
            b = f;
            if (f <= num) System.out.println(f); //что бы нам выводило значения только в заданном диапазоне
        }
    }
}
