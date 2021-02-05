package job1;
public class example_02_101 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            //генерируются ошибки
            throw new NullPointerException("Ошибка!");
            //обрабатываются ошибки
        } catch (NullPointerException e) {
            System.out.println("1" );
            //этот блок все равно выполняется
        }finally {
            System.out.println("2" );
        }
        System.out.println("3");
    }
}
