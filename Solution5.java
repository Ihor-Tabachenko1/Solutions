import java.util.Scanner;

/**
 * Created by ihor on 24.8.17.
 */
public class Solution5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String w = scanner.nextLine();
        System.out.println(polindrom(w));
    }
     public static boolean polindrom (String w) {
         StringBuilder sb = new StringBuilder(w);
         return w.equals(sb.reverse().toString()); //переворачиваем слово и проверяем совпадает ли оно с иходным
     }
}
