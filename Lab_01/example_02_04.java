import java.util.Scanner;//в программе будет использоваться ввод с клавиатуры
public class example_02_04{

    public static void main(String[] args)// начало программы
    {
        Scanner InCMD = new Scanner(System.in);//Сканер будет считывать вводимое с клавиатуры
        System.out.print("Input a number:");//выводится строка для ввода номера
        int num = InCMD.nextInt();//переменой num присваивается значение,введённое с клавиатуры
        System.out.printf("Your number: %d \n", num);//выввод строки с сообщением с новой строки
        InCMD.close();
    }
}//конец программы