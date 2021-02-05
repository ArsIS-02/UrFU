//Генерация исключения в методе.
package job1;
public class example_02_98 {
    //метод m
    public static int m(){
        try {
            System.out.println("0");
            //генерация ошибки
            throw new RuntimeException();
            //эта часть всегда будет отрабатываться
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        //вызов метода m
        System.out.println(m());
    }
}
