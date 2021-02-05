/*Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.*/
import java.util.Scanner;
import java.util.Arrays;
public class example_02_46 {
    public static void main(String[] args) {
        //ввод величины массива
        Scanner InCMD = new Scanner(System.in);
        System.out.println("Введите количество столбцов: ");//ввод значения пользователем
        int Str = InCMD.nextInt();
        System.out.println("Введите количество строк: " );//ввод значения пользователем
        int Clm = InCMD.nextInt();
        //выбор удаляемой строки и столбца
        int del_Clm = (int) (Math.random() * (Clm + 1));
        del_Clm++;
        int del_Str = (int) (Math.random() * (Str + 1));
        del_Str++;
                del_Clm--;
        del_Str--;
        //создание исходного массива
        System.out.println("Первоначально созданный массив:");//сообщение пользователю
        int Mas[][] = new int[Clm][Str];
        //создание выходного массива
        int Mas2[][] = new int[Clm][Str];
        for (int i = 0; i < Clm; i++) {
            for (int q = 0; q < Str; q++) {
                Mas[i][q] = (int) (Math.random() * (80_000 + 1)) - 5_000;
                if (i == del_Clm || q == del_Str) {
                    Mas2[i][q] = 0;
                } else Mas2[i][q] = Mas[i][q];
                System.out.print(Mas[i][q] + " ");            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Сейчас будут удалены " + del_Str + " строка и " + del_Clm + " столбец");//сообщение пользователю

        System.out.println("Массив после операции удаления:");//сообщение пользователю
        for (int i = 0; i < Clm; i++)
            System.out.println(Arrays.toString(Mas2[i]));
        System.out.println("Поздравляю,программа успешно завершена!");//сообщение пользователю

}}