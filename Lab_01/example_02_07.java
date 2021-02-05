import java.util.Scanner;//в программе будет использоваться ввод с клавиатуры
public class example_02_07{

    public static void main(String[] args)//начало программы
    {
        Scanner in = new Scanner(System.in);//Сканер будет считывать вводимое с клавиатуры
        System.out.print("Radius kruga: ");//отображение строки для ввода значения величины радиуса круга
        int radius = in.nextInt();//присвоение переменной radius значения,введённого с клавиатуры
        long area = Math.round(Math.PI * Math.pow(radius, 2));//вычисление значения площади круга путём обращения
        //к встроенным функциям умножения квадрата радиуса на постоянную Пи
        System.out.printf("S kruga s R %d = %d \n", radius,area);//вывод строки с результатом вычисления значения
        // площади круга
    }
} //конец программы