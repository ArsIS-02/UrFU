package example_02_81;
import java.util.Scanner;
public class Rec5 {
    public static int f(int n){
        if (n==0){
            return 0;
        }else {
            if (n==1){
                return 1;
            }else {
                return f(n-2)+f(n-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = inCMD.nextInt();
        System.out.println(f(num));
    }
}
