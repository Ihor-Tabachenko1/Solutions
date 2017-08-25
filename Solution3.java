import java.util.Scanner;

/**
 * Created by ihor on 23.8.17.
 */
public class Solution3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates of point a1");
        int ax1 = scanner.nextInt();
        int ay1 = scanner.nextInt();
        System.out.println("Enter coordinates of point a2");
        int ax2 = scanner.nextInt();
        int ay2 = scanner.nextInt();
        System.out.println("Enter coordinates of point b1");
        int bx1 = scanner.nextInt();
        int by1 = scanner.nextInt();
        System.out.println("Enter coordinates of point b2");
        int bx2 = scanner.nextInt();
        int by2 = scanner.nextInt();
        System.out.println(isCrossed(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));

    }
        private static boolean isCrossed (int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
            int v1=(bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1); //вектор b1b2 * b1a1
            int v2=(bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1); //вектор b1b2 * b1a2
            int v3=(ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1); //вектор a1a2 * a1b1
            int v4=(ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1); //вектор a1a2 * a1b2
            return ((v1*v2<=0) && (v3*v4<=0)); //при пересечении прямых векторное произведение v1 и v2 либо v3 и v4
        }                                      //будут иметь различные знаки, следовательно их произведение
}                                              //будет отрицательным
