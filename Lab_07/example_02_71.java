/*Напишите программу, в которой есть суперкласс с приватным текстовым полем,
конструктором с текстовым параметром и где переопределен метод toString (). На основе
суперкласса путем наследования создается подкласс. У него появляется еще одно
приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
В обоих классах метод toString () переопределяется так, что он возвращает строку с
названием класса и значение текстового поля или текстовых полей */
public class example_02_71
{
    public static void main(String[] args)
    {
        Test02_01 ts1 = new Test02_01("Programming");
        System.out.println(ts1.toString());
        Test02_012 ts2 = new Test02_012("Programming", "science");
        System.out.println(ts2.toString());
    }
}
class Test02_01//текмтовое поле
{
    private String textArea;

    Test02_01(String text)
    {
        this.textArea = text;
    }

    public String getName ()
    {
        return this.textArea;
    }

    public String toString ()
    {
        return "Название класса: " + getClass().getSimpleName() + ", название переменной: " + this.textArea;
    }
}
class Test02_012 extends Test02_01
{
    private String textArea;
    private String comment;
    Test02_012(String text, String textComment)
    {
        super(text);
        this.comment = textComment;
    }
    public String toString ()
    {
        return "Название класса: " + getClass().getSimpleName() + ", название переменной из Первого класса: " + this.getName() + "\n" +
                "Переменная класса: " + this.comment;
    }
}
