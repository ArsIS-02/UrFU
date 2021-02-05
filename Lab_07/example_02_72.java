/*Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе должен быть метод для присваивания значения полю: без параметров и с
одним текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Доступное только для чтения свойство результатом возвращает
длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый). */
public class example_02_72
{
    public static void main(String[] args)
    {
    }}

class Test
{
    private String textArea;

    Test(String text)
    {
        this.textArea = text;
    }

    public String word ()
    {
        return this.textArea;
    }

    public int lengthWord ()
    {
        return this.textArea.length();
    }
}

class Test1 extends  Test
{
    private int lenght = 0;
    Test1(String text)
    {
        super(text);
        lenght = super.lengthWord();
    }

    void display ()
    {
        System.out.println("Размер: " + lenght + " слово: " + word());
    }
}