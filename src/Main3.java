import java.io.*;

class Main3 {
    public static void main(String[] args) {
        try {
            PrintWriter printer = new PrintWriter(new FileWriter("data.txt"));

            printer.println(1234);
            //printer.flush();
            printer.close();

            printer = new PrintWriter(new FileWriter("data.txt", true));
            printer.println();
            printer.append("tototot");
            printer.printf("She has %d kg and %.2f %s height", 50, 160.456, "cm");
            printer.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            //System.out.println((char) bufferedReader.read());
            //System.out.println(bufferedReader.readLine());
            //System.out.println(bufferedReader.readLine());
            //System.out.println(bufferedReader.readLine());
            //System.out.println(bufferedReader.readLine());

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("newData.txt"));

            String tresc = "";
            while ((tresc = bufferedReader.readLine()) != null) {
                //System.out.println(tresc);
                bufferedWriter.write(tresc);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Main3.test(1, 5, 6, 123, "dadad", 5);
    }

    static void test(Object... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
