/*Напишите программу с классом, в котором есть закрытое статическое
целочисленное ноле с начальным нулевым значением. В классе должен быть описан
статический метод, при вызове которого отображается текущее значение статического
поля, после чего значение поля увеличивается на единицу.*/
import java.util.Scanner;
public class example_02_62
{
    public static void main(String[] args)
    {
        var i = 0;
        var res = valueWhile();
        while (i <= res)
        {
            Test2.addValue();
            i++;
        }
    }
    public static int valueWhile ()//класс для перебора чисел
    {
        Scanner input_value = new Scanner(System.in);
        System.out.print("Введите значение с помощью которого вы увидете результат работы класс: ");
        var num = input_value.nextInt();
        return num;
    }
}
class Test2
{
    private static int num = 0;
//вывод на экран массива чисел от 0 до введённого значения
    static void addValue ()
    {
        System.out.println("Значение статического поля: " + num);
        num++;
    }
}
