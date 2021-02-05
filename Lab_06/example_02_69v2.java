public class example_02_69v2 {//массив в отдельном классе для перебора элементов введённой строки
    public char[] MST ( char[] a ){
        char [] ar =  new char [a.length];
        for (int i = 0; i < a.length; i++){
            int buf = a.length - i - 1;
            ar[buf] = a[i];
        }
        return ar;
    }
}
