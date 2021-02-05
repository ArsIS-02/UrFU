/* В программе, вычисляющей среднее значение среди положительных элементов
одномерного массива (тип элементов int), вводимого с клавиатуры, могут
возникать ошибки в следующих случаях:
ввод строки вместо числа;
несоответствие числового типа данных;
положительные элементы отсутствуют.*/
package job2;
import java.util.Scanner;
public class example_02_105 {
    public static void main(String[] args)
    {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Введите размер: ");
        int SArr = InCMD.nextInt();
        System.out.println();
        int[] arr = new int[SArr];
        int INT = 0;
        int pos = 0;
        Scanner scanValue = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            try {
                while (!scanValue.hasNextInt()) {
                    System.out.println("int, please!");
                    scanValue.nextLine();
                }
                INT = scanValue.nextInt();
                if(INT >= 0) {
                    arr[i] = INT;
                    pos++;
                }
            }
            catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                return;
            }
        }
        try {
            if(pos == 0) throw new Exception("В массиве нет положительных элементов.");
        }
        catch (Exception e) {
            System.out.println("Ошибка!: " + e.getMessage());
        }
    }
}
