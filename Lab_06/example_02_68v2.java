public class example_02_68v2 {
    public double SR_ZNC (int [] ar){
        double sr_znc = 0;
        for (int i = 0; i < ar.length; i++){
            sr_znc += ar[i];
        }
        sr_znc /= ar.length;
        return sr_znc;//возврат среднего значения элемента массива
    }
}

