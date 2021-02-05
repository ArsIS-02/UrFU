/*Напишите программу с классом, у которого есть два целочисленных поля.
В классе должны быть описаны конструкторы,позволяющие создавать объекты без передачи аргументов,
с передачей одного аргумента и с передачей двух аргументов.*/
import java.util.Scanner;
public class example_02_53 {
public static void main(String[] args)
        {
        Integer_Test it = new Integer_Test();//создание сканера для ввода целочисленных значений

        System.out.print("Введите значение для конструктора с одним аргументом: ");
        Integer_Test itDouble = new Integer_Test(vvod());//вводим одно значение

        System.out.println("Введите два значения для конструктора с двумя аргументами:  ");
        Integer_Test itDoubleTwo = new Integer_Test(vvod(), vvod());//вводим два значения
        }
public static double vvod()//создание метода ввода
        {
        Scanner input_value = new Scanner(System.in);
        var value = input_value.nextDouble();
        return value;
        }
        }

class Integer_Test
{
    double width, height;

    Integer_Test() {
        this.width = this.height = -1.0;
        System.out.println("Конструктор без аргументов: " + this.width + " " + this.height);
    }

    Integer_Test(double A) {
        this.width = this.height = A;
        System.out.println("Конструктор с одним аргументом: " + this.width + " " + this.height);
    }

    Integer_Test(double B, double C) {
        this.width = B;
        this.height = C;
        System.out.println("Конструктор с двумя аргументами: " + this.width + " " + this.height);
    }
}