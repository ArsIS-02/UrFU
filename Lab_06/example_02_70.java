/*Напишите программу со статическим методом, аргументом которому передается
произвольное количество целочисленных аргументов. Результатом метод возвращает
массив из двух элементов: это значения наибольшего и наименьшего значений среди
аргументов, переданных методу.*/
import java.util.Arrays;
import java.util.Scanner;
public class example_02_70 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner (System.in);
        System.out.print("Введите размер массива: ");//диалог с пользователем
        int num = InCMD.nextInt();
        int [] x = new int [num];
        System.out.println("Исходный массив");//вывод массива на экран
        for (int i=0;i<num ;i++ ) {//наполнение массива случайными числами из промежутка
            int a = (int) (Math.random()*(150_000+1)) - 5_000;
            x[i] = a;
            System.out.print(x[i] + " ");        }
        example_02_70v2 AAA = new example_02_70v2();
        int [] print_ar = AAA.TF(x);
        System.out.print("\nМаксимальный элемент массива = " + print_ar[1] + "\nМинимальный элемент массива = " + print_ar[0] );//вывод результата работы на экран
        }
}
