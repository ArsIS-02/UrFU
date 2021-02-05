/*Напишите программу со статическим методом, которому аргументом передается целочисленный массив и целое число.
Результатом метод возвращает ссылку на новый массив, который получается из исходного массива (переданного первым аргументом методу),
если в нем взять несколько начальных элементов. Количество элементов, которые нужно взять из исходного массива, определяются вторым аргументом метода.
Если второй аргумент метода больше длины массива, переданного первым аргументом, то методом создается копия исходного массива и возвращается ссылка на эту копию.
 */
import java.util.Scanner;
public class example_02_66 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);//создание объекта Scanner для ввода значения с клавиатуры
        System.out.print("Введите количество элементов для массива = ");
        int num = InCMD.nextInt();
        //Создание массива случайных чисел для выборки
        int [] x = new int [num];
        System.out.print("Созданный массив = ");
        //генерация массива,заполнение случайными числами
        for (int i=0;i<num ;i++ ) {
            int a = (int) (Math.random()*(50_999+1)) - 5_000;
            x[i] = a;
            System.out.print(a + " ");
        }

        Scanner InCMD_ = new Scanner(System.in);
        System.out.print("\nВыберите количество элементов = ");//выбор количества элементов для вывода
        int num_ = InCMD_.nextInt();

        System.out.print("Оставшийся массив = ");
        example_02_66v2 arg_ = new example_02_66v2();
        int [] print_arr = arg_.Limit(x, num_);
        System.out.print("\nВернувшийся массив = ");//вывод вернувшегося массива из отдельного класса
        for (int i = 0; i < print_arr.length; i++){
            System.out.print(print_arr[i] + " ");
        }
    }
}
