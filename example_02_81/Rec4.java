package example_02_81;
import java.util.Scanner;
public class Rec4 {
    public static int fact(int n){
        int result;
        if (n==1){
            return 1;
        }else {
            result = fact(n-1)*n;
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = inCMD.nextInt();
        System.out.println(fact(num));
    }
}
