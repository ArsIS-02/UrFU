import java.util.Scanner;//в программе будет использоваться ввод с клавиатуры
public class example_02_05
{
    public static void main(String[] args) {// начало программы

        Scanner in = new Scanner(System.in);//Сканер будет считывать вводимое с клавиатуры
        System.out.print("Input name: ");//отображение строки для ввода имени
        String name = in.nextLine();//присвоение переменной name значения,введённого с клавиатуры
        System.out.print("Input age: ");//отображение строки для ввода возраста
        int age = in.nextInt();//присвоение переменной age значения,введённого с клавиатуры
        System.out.print("Input height: ");//отображение строки для ввода роста
        float height = in.nextFloat();//присвоение переменной height значения,введённого с клавиатуры
        System.out.printf("Name: %s  Age: %d  Height:%.2f \n", name, age, height);//выводс троки с введёнными данными
                in.close();
    }
}//конец программы