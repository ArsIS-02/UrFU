public class example_02_66v2 {
    public static int[] Limit (int[] arr, int lim){

        if (lim > arr.length){
            lim = arr.length;

        }
        int[] Num = new int [lim];
        for (int i = 0; i < lim; i++){
            System.out.print(arr[i] + " ");
            Num[i] = arr[i];
        }
        return Num;
    }
}
