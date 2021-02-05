/*Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.*/
public class example_02_74
{
    public static void main(String[] args)
    {

        Test02_04 test02_04 = new Test02_04('A');

        Test02_041 test02_041 = new Test02_041("Programming", 's');

        Test02_042 test02_042 = new Test02_042(20, "Hello,World", 'o');

    }
}
class Test02_04
{
    public char symbol;

    Test02_04(char ch)
    {
        this.symbol = ch;
    }

   public Test02_04(Test02_04 t04)
    {
        this(t04.symbol);
    }
}

class Test02_041 extends Test02_04
{
    public String textArea;

    Test02_041(String text, char ch)
    {
        super(ch);
        this.textArea = text;
    }
    public Test02_041(Test02_041 t041)
    {
        this(t041.textArea, t041.symbol);
    }
}
class Test02_042 extends Test02_041
{
    public int perem;
    Test02_042(int val, String text, char ch)
    {
        super(text, ch);
        this.perem = val;
    }

    public Test02_042(Test02_042 t042)
    {
        this(t042.perem, t042.textArea, t042.symbol);
    }

    public void display()
    {
        System.out.println(this.perem + " : " + this.symbol + " : " + this.textArea);
    }
}