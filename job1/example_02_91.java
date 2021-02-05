//Сгенерировано и перехвачено RuntimeException

package job1;

public class example_02_91 {
    public static void main(String[] args) {
        try {
            System.out.println("0");

            //генерация ошибки
            throw new RuntimeException("Непроверяемая ошибка");

            //перехватывается созданное исключение
        } catch (RuntimeException e) {

            //выводится надпись 1 и созданная ошибки
            System.out.println("1 "+ e);
        }
        System.out.println("2");
    }

}
