/*Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив. В результате вызова метода элементы массива попарно
меняются местами: первый — с последним , второй — с предпоследним и так далее.*/
import java.util.Scanner;
public class example_02_69 {
    public static void main(String[] args) {
        System.out.print("Введите строку = ");//строка для пользователя на экране
        Scanner InCMD = new Scanner(System.in);
        String str = InCMD.nextLine();
        char [] str_char = str.toCharArray();//наполнение массива символами со введённой строки
        System.out.print("Массив на выходе = ");
        example_02_69v2 arg_ = new example_02_69v2();//ссылка на массив в сопряжённом классе
        char [] print_arr = arg_.MST(str_char);
        for (int i = 0; i < print_arr.length; i++) {
            System.out.print(print_arr[i] + " ");
        }
    }
}
