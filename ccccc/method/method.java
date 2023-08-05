package method;

public class method {
    static int logic(int a, int b) {
        int c;
        if (a > b) {
            c = a + b;
        } else {
            c = (a + b) * 7;
        }
        return c;
    }

    public static void main(String[] args) {
        int a = 5, b = 10, c;
       c= logic(a,b);
       System.out.println(c);
    }
}
