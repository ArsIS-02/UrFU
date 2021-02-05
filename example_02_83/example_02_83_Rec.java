package example_02_83;
import java.util.Scanner;
public class example_02_83_Rec {
    private int num;
    private int arra [];
    private int i = 0;
    public void setNum(int num) {
        this.num = num;
        this.arra = new int[this.num];
        Rec_In(this.arra, this.i);
    }
    public int getNum() {
        Rec_Out(this.arra, this.i);
        return num;
    }
    private void Rec_In (int[] arra, int i){
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите элемент ");
        int num = inCMD.nextInt();
        this.arra[this.i] = num;
        this.i++;
        if (this.i >= this.num){
            return;
        }
        Rec_In(this.arra,this.i);
    }
    private void Rec_Out (int[] arra, int i ){
        if (i <= 0 ){
            return;
        }
        this.i--;
        System.out.print(this.arra[this.i]);
        Rec_Out(this.arra, this.i);
    }
}
