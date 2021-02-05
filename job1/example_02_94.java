// Перехват исключения подходящим классом.
package job1;
public class example_02_94 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            //генерирование ошибки RuntimeException
            throw new RuntimeException("ошибка");

            //проверка на ошибку NullPointerException
        } catch (NullPointerException e) {
            System.out.println("1" );

            //проверка на ошибку группы Exception
            //выполнение этого блока, потому что ошибка RuntimeException относится к группе Exception
        }catch (Exception e) {
            System.out.println("2" );

            //проверка на ошибку группы Error
        }catch (Error e) {
            System.out.println("3" );
        }
        System.out.println("4");
    }
}
