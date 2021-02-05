/*Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее. */
import java.util.Scanner;
import java.util.Arrays;
public class example_02_47 {
    public static void main(String[] args) {
        //ввод величины массива
        Scanner InCMD = new Scanner (System.in);
        System.out.print("Введите количество столбцов: ");
        int A = InCMD.nextInt();
        System.out.print("Введите количество строк: ");
        int B = InCMD.nextInt();
        //создание исходного массива
        System.out.println("Исходный массив,заполненный случайными числами:");
        int arr [][] = new int[B][A];
        //создание выходного массива
        int arr1 [][] = new int[B][A];
        int invert_num = A - 1;
        for (int i = 0; i< B; i++) {
            for (int q = 0; q < A; q++) {
                arr[i][q] = (int) (Math.random()*(20_000+1)) - 8_000;
                if (i %2 == 0) {
                    arr1[i][q] = arr[i][q];
                }else{
                    arr1[i][invert_num] = arr[i][q];
                    invert_num--;
                    if (invert_num < 0){
                        invert_num = A - 1;
                    }}
                System.out.print(arr[i][q] + " ");
            }System.out.println(" ");
        }System.out.println(" ");
        System.out.println("Массив,созданный из элементов предыдущего методом ''змейка'':");
        for (int i = 0; i < B; i++)
            System.out.println(Arrays.toString(arr1[i]));
   }
}
