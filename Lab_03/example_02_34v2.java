/*Напишите программу, в которой пользователем вводится два
        целых числа. Программа выводит все целые числа — начиная с наименьшего
        (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
        чисел). Предложите разные версии программы (с использованием разных
        операторов цикла).*/
import java.util.Scanner;//в программе будет использоваться ввод с клавиатуры
public class example_02_34v2 {
    public static void main(String[] args) // начало программы
    {
        System.out.println("Введите первое число:");//вывод строки с предложением ввода пользователю
        Scanner in = new Scanner(System.in);//считывание с клавиатуры введённого значения
        int num1 = in.nextInt();//присвоение num1 значения с клавиатуры
        System.out.println("Введите второе число число:");//вывод строки с предложением ввода пользователю
        int num2 = in.nextInt();//присвоение num2 значения с клавиатуры
        int Size;//объявление переменной размерности массива
        int Min;
        if (num1 > num2)//сравнение введённых чисел и определение значения размера выделяемой памяти под массив
        {
                Size = num1 - num2 + 1;//инициализация переменной размера массива если num1>num2
                Min = num2;
        }
        else
            {
                Size = num2 - num1 + 1;//инициализация переменной размера массива если num2>num1
                Min=num1;
            }
        System.out.printf("Число целых чисел для массива: %d \n", +Size);//вывод строки на экран с указанием размера массива
        int Nums[];//объявление массива чисел
        Nums = new int[Size];//объявление и инициализация массива чисел
        int i = 0;//присвоение переменной счётчика ячеек первого индекса
        Nums[0]=Min;//присвоение первой ячейке массива минимального значения из двух введённых
        while (i<Size) { //заполнение элементов в массиве циклом while
            Nums[i]=Min;
            System.out.println("Элемент массива ["+i+"] = " + Nums[i]);// Сообщение пользователю "для красоты и понимания"
            i++;//приращение счётчика
            Min++;//приращение переменной
        }
    }
}//конец программы