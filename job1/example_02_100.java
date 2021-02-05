//Генерация исключительной ситуации в методе.
//Использование оператора return в секциях try и finally.
package job1;
public class example_02_100 {
    public static int m(){
        try {
            System.out.println("0");
            return 15;
            //этот блок выполнится обязательно и именно этот return сработает
        } finally {
            System.out.println("1");
            return 20;
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
