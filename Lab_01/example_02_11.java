/* Напишите программу, в которой пользователю предлагается ввести
название месяца и количество дней в этом месяце. Программа выводит
сообщение о том, что соответствующий месяц содержит указанное количество
дней.*/
import java.util.Scanner;//в программе будет использоваться ввод с клавиатуры
public class example_02_11 {
    public static void main(String[] args) {//начало программы
        Scanner in = new Scanner(System.in);//Сканер будет считывать вводимое с клавиатуры
        System.out.println("Введите название месяца:");//программа выводит на экран предложение ввести текущий день недели
        String month = in.nextLine();//переменной day присваивается значение данных,введённых пользователем с клавиатуры
        System.out.println("Введите количество дней в месяце:");//программа выводит на экран предложение ввести текущий день недели
        int days = in.nextInt();//переменной days присваивается значение данных,введённых пользователем с клавиатуры
        System.out.printf("Месяц %s содержит %d дней",month,days);//программа выводит на экран предложение ввести текущий день недели
    }
}//конец программы