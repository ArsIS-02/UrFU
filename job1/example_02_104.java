// Обработка исключения, порожденного одним методом m() в другом (в методе main).
package job1;
public class example_02_104 {
    //что бы вызываемый метод не умер оповещаем об исключении через throws ArithmeticException
    public static void m(int x) throws ArithmeticException{
        int h=10/x;
    }
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Размер массива= " + l);
            m(l);
            //обработка ошибки
        } catch (ArithmeticException e) {
            System.out.println("Ошибка !: Деление на ноль!");
        }
    }
}
