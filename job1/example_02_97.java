//Нельзя перехватить брошенное исключение с помощью чужого catch, даже если перехватчик подходит
package job1;
public class example_02_97 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
        }
        System.out.println("1" );
        //создан новый обработчик для перехвата
        try {
            throw new ArithmeticException();
        }catch (ArithmeticException e) {
            System.out.println("2" );
        }
        System.out.println("3");
    }
}
