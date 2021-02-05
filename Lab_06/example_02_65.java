/*Напишите программу со статическим методом, которым вычисляется сумма
квадратов натуральных чисел 12 + 22 + 32 + ... + п2. Число п передается аргументом методу.
Предложите версию метода с рекурсией и без рекурсии. Для проверки результата можно
использовать формулу 12 + 22 +32+…+n2 = (n+l) (2n + 1)/6*/
import java.util.Scanner;
public class example_02_65 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//создание объекта сканера введённого значения с клавиатуры пользователем
        System.out.print("Введите число для вычисления суммы квадратов натуральных чисел: ");
        var result = Test5.powValue(scanner.nextInt());
        System.out.println("Результат вычисления суммы квадратов натуральных чисел: " + result);
    }
}
class Test5
{    static int powValue(int n)
    {   int result = 0;
        for( int i = 0; i <= n; i++)//перебор натуральных чисел
        {
            result += Math.pow(i,2);//возведение числа в квадрат и суммирование с предыдущей суммой
        }
        return result;
    }
}
