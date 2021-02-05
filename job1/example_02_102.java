//Исключение IllegalArgumentException – неверные аргументы.
package job1;
public class example_02_102 {
    public static void m(String str, double chislo){
        if (str==null) {
            /*генерация ошибки и вылет программы,потому что обрабатывать нечем (в прикладной программе)
            и обработана ошибки стандартным обработчиком*/
            throw new IllegalArgumentException("Строка введена неверно!");
        }
        if (chislo>0.001) {
            throw new IllegalArgumentException("Неверное число!");
        }
    }
    public static void main(String[] args) {
        m(null,0.000001);
    }
}