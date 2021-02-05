//Генерация исключительной ситуации в методе и
//дополнительное использование оператора return.
package job1;
public class example_02_99 {
    public static int m(){
        try {
            System.out.println("0");
            return 55; // выход из метода
            //даже при выходе из метода, этот блок будет обрабатываться
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args)
    {
        System.out.println(m());
    }
}
