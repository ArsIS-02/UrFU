/*Напишите программу, в которой создается двумерный
целочисленный массив. Он заполняется случайными числами. Затем в этом
массиве строи и столбцы меняются местами: первая строка становится первым
столбцом, вторая строка становиться вторым столбцом и так далее. Например,
если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем
массив из 5 строк и 3 столбцов.*/
import java.util.Scanner;
public class example_02_45 {
    public static void main(String[] args) {
        //ввод величины массива
                Scanner InCMD = new Scanner (System.in);
                System.out.print("Введите количество столбцов: ");//ввод значения пользователем
                int A = InCMD.nextInt();
                System.out.print("Введите количество строк: ");//ввод значения пользователем
                int B = InCMD.nextInt();
                //создание первоначального массива
                System.out.println("Первоначальный массив:");
                int mas [][] = new int[B][A];
                for (int i = 0; i<B; i++) {
                    for (int q = 0; q < A; q++) {
                        mas[i][q] = (int) (Math.random()*(50_000+1));
                        System.out.print(mas[i][q] + " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
        System.out.println("Массив,где строки поменялись со столбцами:");
                //разворот массива и вывод его на экран
                int mas1 [][] = new int [B][A];
                for (int i = 0; i<A; i++) {
                    for (int q = 0; q < B; q++) {
                        mas1[q][i] = mas[q][i];
                        System.out.print(mas1[q][i] + " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
        System.out.println("Поздравляю,Вы перевернули массив!");
                }
        }