/*Напишите программу, в которой Пользователь последовательно вводит
        название текущего дня недели, название месяца и дату (номер дня в месяце).
        Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).*/
import java.util.Scanner;//в программе будет использоваться ввод с клавиатуры
class example_02_10 {
    public static void main(String[] args)//начало программы
    {   Scanner in = new Scanner(System.in);//Сканер будет считывать вводимое с клавиатуры
        System.out.println("Введите текущий день недели:");//программа выводит на экран предложение ввести текущий день недели
        String day=in.nextLine();//переменной day присваивается значение данных,введённых пользователем с клавиатуры
        System.out.println("Введите название текущего месяца:");//программа выводит на экран предложение ввести название текущего месяца
        String month=in.nextLine();//переменной month присваивается значение данных,введённых пользователем с клавиатуры
        System.out.println("Введите сегодняшнее число:");//программа выводит на экран предложение ввести текущий день месяца
        int date=in.nextInt();//переменной date присваивается значение данных,введённых пользователем с клавиатуры
        System.out.printf("Сегодня %s, %d, %s",day,date,month);//программа выводит на экран следующей строкой данные о дне недели,месяце,сегодняшнем числе месяца
    }
}//конец программы