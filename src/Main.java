public class Main {
    public static void main(String[] args) {
       int a = sum(66,77);
       int b = div(99,11);
       int c = Mil(44, 78);
       int d = Del(99, 11);
       int MM = Mil(b, d);
       println(MM);
       int BB = sum(MM, b);
       println(BB);
       int CC = Del(b,d);
       println(CC);
       int DD = Mil(CC, BB);

    }
    static int sum(int number1, int number2) {
        return number1 + number2;
    }
    static int div (int number1, int number2) {
        return number1 - number2;
    }
    static int Mil (int number1, int number2) {
        return number1 * number2;
    }
    static int Del (int number1, int number2) {
        return number1/number2;
    }
    static void println(int number) {
        System.out.println(number);
    }

}