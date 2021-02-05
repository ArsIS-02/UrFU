/*Напишите программу с классом, у которого есть символьное и целочисленное поле.
В классе должны быть описаны версии конструктора с двумя аргументами (целое число и символ – определяют значения полей),
а также с одним аргументом типа double. В последнем случае действительная часть аргумента определяет код символа
(значение символьного поля), а дробная часть (с учетом десятых и сотых) определяет значение целочисленного поля.
Например, если аргументом передается число 65.1267, то значением символьного поля будет символ ‘A’ с кодом 65, а целочисленное поле получит значение 12
(в дробной части учитываются только десятые и сотые).*/
import java.util.Scanner;
public class example_02_54
{
    public static void main(String[] args)
    {
        CharAndInteger cai = new CharAndInteger( inputChar(), (int) inputDouble() );
        cai = new CharAndInteger(inputDouble());
        System.out.println(cai.result());
    }
    public static double inputDouble ()
    {
        Scanner input_value = new Scanner(System.in);
        var value = input_value.nextDouble();
        return value;
    }
    public static char inputChar()
    {
        Scanner input_value = new Scanner(System.in);
        var value = input_value.next();
        return value.charAt(0);
    }
}
class CharAndInteger
{
    char first;
    int second;
    CharAndInteger(char a, int b) {
        this.first = a;
        this.second = b;
    }
    CharAndInteger(double s) {
        this.first = (char)((int)s);
        double res = (s - (double)((int)s)) * 100.0D;
        this.second = (int)res;
    }
    String result() {
        char var10000 = this.first;
        return var10000 + Integer.toString(this.second);
    }
}

