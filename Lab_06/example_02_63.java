import java.util.Scanner;

public class example_02_63
{
    public static void main(String[] args)
    {

        var array= createArray();
        Test3.getArray(array);
    }
    static Integer[] createArray() {
        Scanner scanner = new Scanner(System.in);
        // ввод пользователем размера массива.
        System.out.print("Введите размер массива: ");
        var sizeNums = scanner.nextInt();
        Integer[] Nums = new Integer[sizeNums];
        System.out.print("Заполните массив собственными интересующими Вас значениями: ");
        // заполните массив собственными интересующими значениями.
        for (int i = 0; i < Nums.length; i++)
        {
            Nums[i] = scanner.nextInt();
        }
        return Nums;
    }
}
class Test3
{//основной метод
    public static void getArray(Integer[] array)
    {
        var maxValue = getMaxValue(array);
        var minValue = getMinValue(array);
        var averageValue = getAverageValue(array);

        System.out.println("Максимальное значение набора чисел (массива): " + maxValue + "\n" +
                "Минимальное значение набора чисел (массива): " + minValue + "\n" +
                "Среднее значение набора чисел (массива): " + averageValue);

    }
    private static int getAverageValue(Integer[] array)
    {
        int averageValue = 0;
        for(int i = 0; i < array.length; i++)
        {
            averageValue += array[i];
        }
        return averageValue / array.length;
    }
    private static int getMinValue(Integer[] array)//метод поиска минимального значения в массиве
    {
        var minValue = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(minValue > array[i]) minValue = array[i];
        }
        return minValue;
    }

    private static int getMaxValue(Integer[] array)//метод поиска максимального значения в массиве
    {
        var maxValue = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(maxValue < array[i]) maxValue = array[i];
        }

        return maxValue;
    }
}
