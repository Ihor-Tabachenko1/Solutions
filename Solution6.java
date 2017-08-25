import java.util.Scanner;

/**
 * Created by ihor on 24.8.17.
 */
public class Solution6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = scanner.nextLine();
        System.out.println(delNum(text));
    }
    private static String delNum (String text) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while  (i < text.length()) {
            if (Character.isDigit(text.charAt(i)));  //пропускаем если число
            else
                sb.append(text.charAt(i));
                i++;     //иначе записываем и продолжаем цикл
        }
        return sb.toString(); //возвращаем строку (переводим ее в строчный тип)
    }
}
