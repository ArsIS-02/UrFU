/*Создать приложение, позволяющее ввести и вывести
одномерный массив целых чисел. Для ввода и вывода массива
разработать рекурсивные методы вместо циклов for.*/
package example_02_83;
import java.util.Scanner;
public class example_02_83_Main {
    public static void main(String[] args) {
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите количество элементов ");
        int num = inCMD.nextInt();
        example_02_83_Rec Obj = new example_02_83_Rec();
        Obj.setNum(num);
        System.out.println("Вывод массива");
        Obj.getNum();
    }
}
