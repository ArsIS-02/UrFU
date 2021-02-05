/*Напишите программу, в которой пользователь вводит целое число
в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
Если введенное пользователем число выходит за допустимый диапазон,
выводится сообщение о том, что введено некорректное значение. Используйте
оператор выбора switch.*/
import java.util.Scanner;
public class example_02_31{
    public static void main(String[] args)
    {
        System.out.println("Введите номер дня недели по порядку:");
        Scanner in = new Scanner(System.in);
        int numberDay = in.nextInt();
        switch(numberDay) {
            case 1: System.out.println("Понедельник");
                break;
            case 2: System.out.println("Вторник");
                break;
            case 3: System.out.println("Среда");
                break;
            case 4: System.out.println("Четверг");
                break;
            case 5: System.out.println("Пятница");
                break;
            case 6: System.out.println("Суббота");
                break;
            case 7: System.out.println("Воскресенье");
                break;
            default: System.out.println("Ошибка. Дня недели под таким номером не существует!");
                break;
        }

    }

}