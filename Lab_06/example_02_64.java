/*Напишите программу,в которой описан статический метод для вычисления двойного факториала числа, переданного аргументом методу.
По определению, двойной факториал числа п (обозначается как n!!) — это произведение через одно всех чисел,
не больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для нечетного п и равен 2 для четного n).
Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15. Предложите версию метода без рекурсии и с рекурсией.
 */
import java.util.Scanner;
public class example_02_64 {
    public static void main(String[] args)//основной метод класса
    {   Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение вычисляемого двойного факториала: ");
        var getValue = Test4.doubleFactorial(scanner.nextInt());
        System.out.println("Размер вычисляемого двойного факториала: " + getValue);
    }
}
class Test4
{
    public static int doubleFactorial(int valueFactorial)//метод поиска двойного факториала
    {
        int fact = 1;
        while (valueFactorial >= 1) {
            fact *= valueFactorial;
            valueFactorial -= 2;
        }
        return fact;//возврат значения fact  в основной метод
    }
}