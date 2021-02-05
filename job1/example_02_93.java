//Перехват исключения подходящим классом.
package job1;
public class example_02_93 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            //создание ошибки
            throw new RuntimeException("Ошибка!");

            //ожидание ошибки NullPointerException но сгенерированная ошибка другая
        } catch (NullPointerException e) {
            System.out.println("1" );
            //ожидание (и последующие выполнение) нужной ошибки
        }catch (RuntimeException e) {
            System.out.println("2" );
            //ожидание другой ошибки
        }catch (Exception e) {
            System.out.println("3" );
        }
        System.out.println("4");
    }

}
