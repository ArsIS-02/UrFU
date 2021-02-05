//Пример работы с аргументами метода main.
package job1;
public class example_02_103 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Размер массива= " + l);
            //генерация ошибки более естественным образом
            int h=10/l;
            args[l + 1] = "10";
            //обработка ошибки
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
            // не выполняемый блок
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует!");
        }
    }
}
