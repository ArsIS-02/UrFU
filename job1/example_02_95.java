//Исключение не перехвачено.

package job1;

public class example_02_95 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            //создание ошибки RuntimeException
            throw new RuntimeException("Ошибка!");
            //перехват другой ошибки
        } catch (NullPointerException e) {
            System.out.println("1" );
        }
        System.out.println("2");
        //ошибка осталась не перехваченной
    }
}
