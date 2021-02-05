/*Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода.
Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа.
Третий метод позволяет вывести в консольное окно символ (значение поля) и его код. */
import java.util.Scanner;
public class example_02_51 {
    private static char First;
    //первый метод,присваивающий значение полю
    private static void InChar (){
        //ввод величины массива сохранит только первый вводимый символ
        Scanner InCMD = new Scanner (System.in);
        System.out.print("Введите строку: ");
        First = InCMD.next().charAt(0);
        System.out.println("Символ = " + First);//вывод на экран первого символа строки
    }
    private static int Second() {
        return (int) First;
    }
    //выполнение всех методов,вывод в консоль символа и кода символа
    public static void main(String[] args) {
        InChar();
        System.out.println("Код символа = " + Second());// вывод на экран строки с кодом символа на экране
    }
}
