class example_02_06
{
    static double a =10.0, b=4.0, c;//объявление переменных a со значением 10,b со значением 4
    public static double hyp(){//объявление метода hyp() для вычисления гипотенузы прямоугольного треугольника
        return c = Math.sqrt(a*a + b*b);//действия метода hyp() с переменными a и b
    }
    public static void main(String[] args) {// начало основной программы
        System.out.println("katet а=" + a);// вывод строки,,сообщающей значение переменной a
        System.out.println("katet b=" + b);// вывод строки,,сообщающей значение переменной b
        System.out.println("hypotenuse с=" + hyp());// вывод строки,,сообщающей значение гипотенузы,вычисленной методом
        //hyp()
    }
}//конец программы