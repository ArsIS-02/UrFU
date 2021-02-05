import java.util.*;

public class example_02_48 {
    public static void main(String[] args) {
        //ввод величины массива
        Scanner InCMD = new Scanner (System.in);
        System.out.print("Введите строку для кодирования: ");
        String str = InCMD.nextLine();
        char[] ch = str.toCharArray();
        System.out.print("Введите ключ для шифрования : ");
        int num = InCMD.nextInt();
        num %= 24;
        //массив символов для проверки и сдвига
        char [] ABC = {'а', 'б', 'в', 'г' , 'д',
                'е', 'ё', 'ж', 'з', 'и',
                'й', 'к', 'л', 'м', 'н',
                'о', 'п', 'р', 'с', 'т', 'у',
                'ф', 'х', 'ц', 'ч', 'ш','щ','ъ','э','ю','я'};
        //колдунство для создания шифра
        System.out.print("output string: ");
        for (int i = 0; i < str.length(); i++ ) {
            boolean switch_ = false;
            for (int q = 0; q <= 33; q++ ) {
                if (ch[i] == ABC[q]) {
                    int buf = (q + num) % 33;
                    switch_ = true;
                    //System.out.println(buf);
                    System.out.print(ABC[buf]);
                    break;
                }}
            if (!switch_ == false) {
                System.out.println("\nвведён недопустимый символ или знак\n");
                return;
            }
        }
        System.out.println(" ");
       String input_line = InCMD.nextLine();
        while (true){
            System.out.println("Выполнить обратное преобразование (д/н)?: ");
            String input_line_AAA = InCMD.nextLine();
            if (input_line_AAA.equals("д")){
                System.out.print(str);
                break;
            }
            else if (input_line_AAA.equals("н")) {
                System.out.print("Эх...Ну прощай тогда...");
                break;
            }else System.out.println("Ерунду говорите!");

        }
    }
}
