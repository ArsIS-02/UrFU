/*Напишите программу с классом, у которого есть два символьных поля и
метод. Он возвращает результат, и у него нет аргументов. При вызове метод
выводит в консольное окно все символы из кодовой таблицы, которые
находятся «между» символами, являющимися значениями полей объекта (из
которого вызывается метод). Например, если полям объекта присвоены
значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
выводиться все символы от ‘A’ до ‘D’ включительно.*/
import java.util.Scanner;
public class example_02_52 {
    private static char First;//создание первого поля
    private static char Second;//создание второго поля
    public static void Third () {
        Scanner InCMD = new Scanner (System.in);
        System.out.print("Введите первый символ: ");//
        First = InCMD.next().charAt(0);
        System.out.print("Введите второй символ:");
        Second = InCMD.next().charAt(0);
        System.out.println("---");//разделитель
        for (int i = (int) First; i<= (int) Second; i++ ) {//перебор символов из кодовой таблицы8
            System.out.println("Символ = " + (char) i );//вывол на экран символа
        }
    }
    public static void main(String[] args) {
        Third ();
    }

}