/*Напишите программу, в которой Пользователь вводит имя и возраст.
Программа отображает сообщение об имени и возрасте пользователя.*/
import java.util.Scanner;//в программе будет использоваться ввод с клавиатуры
public class example_02_09 {
    public static void main(String[] args)//начало программы
    {
        Scanner in = new Scanner(System.in);//Сканер будет считывать вводимое с клавиатуры
        System.out.println("Ваше имя:");//программа выводит на экран предложение ввести имя пользователя
        String name = in.nextLine();//переменной name присваивается значение данных,введённых пользователем с клавиатуры
        System.out.println("Ваш возраст:");//программа выводит на экран предложение ввести возраст пользователя
        int age = in.nextInt();//переменной age присваивается значение данных,введённых пользователем с клавиатуры
        System.out.printf("Вас зовут %s, Вам %d лет",name,age);//программа выводит на экран имя и возраст пользователя
    }
}//конец программы