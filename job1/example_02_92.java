//Исключение перехвачено перехватчиком предка.

//IDE не хотела запускать код с выводом 1 в консоль

package job1;

public class example_02_92 {
    public static void main(String[] args) {
        try {
            System.out.println("0");

            //создается ошибки
            throw new RuntimeException("Непроверяемая ошибка");
//          System.out.println("1");

            //перехватывается ошибка
        } catch (Exception e) {
            System.out.println("2 "+ e );
        }
        System.out.println("3");
    }
}
