/*Написать программу, которая проверяет, попадает ли введение
пользователем число в диапазон от 5 до 10 включительно.*/
import java.util.Scanner;//в программе будет использоваться ввод с клавиатуры
public class example_02_24 {
    public static void main(String[] args)//начало программы
    {
        Scanner in = new Scanner(System.in);//обращение ко вводу с клавиатуры
        System.out.println("Введите число:");//программа выводит на экран предложение ввести число
        double num1 = in.nextDouble();/*переменной num1 присваивается значение данных,введённых пользователем
                с клавиатуры*/
        if (num1 >= 5 && num1 <= 10) //проверка условия задачи
            System.out.printf("Число %.2f попадает в промежуток от 5.00 до 10.00", num1);// в случае успеха вывод строки сообщения
        else
            System.out.println("Число не подходит");// в случае неподходящего числа вывод сообщения
    }
}//конец программы

