package Errors;

public class Fin {

    public static int greeet() {

        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("this is finnallly");
        }
        return 0;

    }

    public static void main(String[] args) {
        int k = greeet();
        System.out.println(k);
        int a = 43;
        int b = 9;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);

            } finally {
                System.out.println("i a m finnally" + b);
            }
            b--;
        }
        try {
            System.out.println(50 / 3);
        } finally {
            System.out.println("Yes this is finally");
        }
    }
}
