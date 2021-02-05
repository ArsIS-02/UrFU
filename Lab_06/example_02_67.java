/*Напишите программу со статическим методом, аргументом которому передастся
символьный массив, а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива-аргумента.*/
import java.util.Scanner;
public class example_02_67 {
    public static void main(String[] args) {
        System.out.print("Введите строку = ");//строка диалог с пользователем
        Scanner InCMD = new Scanner(System.in);
        String str = InCMD.nextLine();
        char [] str_char = str.toCharArray();//инициализация элементов массива,введённого пользователем
        System.out.print("Выходной массив = ");//на экран выводится массив,состоящий из кодов введённых символов
        example_02_67v2 arg_ = new example_02_67v2();//массив формируется в отдельном классе
        int [] print_arr = arg_.CHAR(str_char);
        for (int i = 0; i < print_arr.length; i++) {
            System.out.print(print_arr[i] + " ");
        }
    }
}
