public class example_02_49 {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if (reader==null) return "";
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(reader);

        String string = bufferedReader.readLine();


        for (char c: string.toCharArray()
        ) {
            sb.append((char)(c+key));
        }

        return sb.toString();
    }
}
