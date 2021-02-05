//Последовательность перехвата должна
//соответствовать иерархии классов исключений. Предок не должен
//перехватывать исключения раньше потомков. Указанный пример
//выдает ошибку компилятора. Программу запустить невозможно.
//IDE потребовала поменять исключения вызывающие 2 и 3 местами
// так как сначала перехватывалась общее, после частности
package job1;
public class example_02_96 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1" );
        } catch (RuntimeException e) {
            System.out.println("2" );
        } catch (Exception e) {
            System.out.println("2" );
        }
        System.out.println("4");
    }
}
