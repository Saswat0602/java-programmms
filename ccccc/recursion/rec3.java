package recursion;

public class rec3{
    public static int calc(int x, int n) {
        if (n == 0) {
            return 1;
        }if (x == 0) {
            return 0;
        }
        int xp1 = x * calc(x, n - 1);
        int xpower = x * xp1;

        return xpower;
    }
    public static void main(String[] args) {
        int x = 2, n = 2;
        int ans = calc(x, n);
        System.out.println(ans);
    }
}
