/*Напишите программу, в которой на основе суперкласса создается подкласс, а на
основе этого подкласса создается еще один подкласс (цепочка наследования из трех
классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
параметром для присваивания значения полю и конструктор с одним параметром. Во
втором классе появляется открытое символьное поле, метод с двумя параметрами для
присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта.*/
public class example_02_73
{
    public static void main(String[] args)
    {
        Test07_03 test07_03 = new Test07_03(20);
        System.out.println(test07_03.toString());

        Test07_031 test10_031 = new Test07_031('A', 23);
        System.out.println(test10_031.toString());

        Test07_032 test10_032 = new Test07_032("Programming",'A', 231);
        System.out.println(test10_032.toString());
    }
}
class Test07_03
{
    public int num = 0;
    public Test07_03(int val)
    {
        this.num = val;
    }
    public void setVal (int val)
    {
        this.num = val;
    }
    public String toString()
    {
        return  "Имя класса: " + getClass().getSimpleName() +
                "Значение переменной: " + this.num;
    }
}
class Test07_031 extends Test07_03
{
    public char symbol;

    public Test07_031(char ch, int val)
    {
        super(val);
        this.symbol = ch;
    }

    public void setFirst(char ch, int val)
    {
        super.setVal(val);
    }

    public String toString()
    {
        return  "Имя класса: " + getClass().getSimpleName() +
                "Значение переменных: " + this.symbol + " : " + super.num;
    }
}
class Test07_032 extends Test07_031
{
    public String symb;
    public Test07_032(String str, char ch, int val)
    {
        super(ch, val);
        this.symb = str;
    }
    public void setValueString (String str, char ch, int val)
    {
        super.setFirst(ch, val);
    }
    public String toString()
    {
        return  "Имя класса: " + getClass().getSimpleName() +
                "Значение переменных: " + this.symb + " : " + super.symbol + " : " + super.num;
    }
}