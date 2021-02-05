package example_02_82;
public class example_02_82_Rec{
    //переменные для работы - внешние
    private int num;
    private int arra[];
    //переменные для работы - внутренние
    private int i = 0;
    public void setNum(int num) {
        this.num = num;
        this.arra = new int[this.num];
        Translate(this.num, this.arra, this.i);
    }
    public int getNum() {
        for (int q = this.i; q >= 0; q--){
            System.out.print(arra[q]);
        }
        return num;
    }
    private void Translate (int num, int [] arra, int i){
        int buf =num / 2;
        arra[this.i] = num - buf * 2;
        if (num - buf == 1 || num - buf == 0){
            return;
        }
        num = buf;
        this.i++;
        Translate(num,arra, this.i);
    }
}
