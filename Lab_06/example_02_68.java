/*Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве).*/
import java.util.Scanner;
public class example_02_68 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Введите количество элементов для массива = ");//сообщение пользователю на экране для диалога
        int num = InCMD.nextInt();
        //Создание массива случайных чисел из диапазона для выборки
        int [] x = new int [num];
        System.out.print("Созданный массив = ");
        //случайное наполнение массива
        for (int i=0;i<num ;i++ ) {
            int a = (int) (Math.random()*(150_000+1)) - 15_000;
            x[i] = a;
            System.out.print(a + " ");
        }
        example_02_68v2 arg_ = new example_02_68v2();//ссылка на массив,создаваемый в другом классе
        double print_ = arg_.SR_ZNC(x);
        System.out.print("\n Среднее значение элемента для массива = " + print_);
    }
}

