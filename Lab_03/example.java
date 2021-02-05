import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner (System.in);

           //ввод значения
                 System.out.print("Input value number: ");
                 int num = InCMD.nextInt();
                 System.out.print("\n");
                //вывод возможных алгоритмов
                System.out.print("ALGORITMS: \n FOR = 0 \t DO_WHILE = 1 \t WHILE = 2 \n");
               System.out.print("Input options: ");
                int option = InCMD.nextInt();
                System.out.print("\n");
              int i = 0;
              int iter = 0;
                long startTimeGlobal = System.currentTimeMillis();
                switch (option){
                    case 0:
                           System.out.print("FOR: ");
                              for (i = 0 ; i <= num * num; i++){
                                    if (i%5 == 2 && i%3 == 1){
                                            System.out.print(i + " ");
                                          iter++;
                                        }
                                  if (iter == num){
                                          break;
                                        }
                                 }
                            break;

                      case 1:
                            System.out.print("DO_WHILE: ");
                            do {
                                   if (i%5 == 2 && i%3 == 1){
                                             System.out.print(i + " ");
                                          iter++;
                                     }
                                   if (iter == num){
                                          break;
                                          }
                                   i++;
                              }while (i <= num * num);
                            break;
                      case 2:
                          System.out.print("WHILE:");
                          while (i <= num){
                               if (i%5 == 2 && i%3 == 1){
                                           System.out.print(i + " ");
                                        iter++;
                                        }
                                    if (iter == num){
                                         break;
                                        }
                                   i++;
                             }
                            break;
                    }
                long endTimeGlobal = System.currentTimeMillis();
                System.out.println("\nGlobal Execution time: " + (endTimeGlobal-startTimeGlobal) + "ms" );
           }
}