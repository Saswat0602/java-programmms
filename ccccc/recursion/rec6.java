package recursion;

public class rec6 {

    public static int f = -1;
    public static int l = -1;

    public static void occurance(String src, int idx, char element) {

        if (idx == src.length()) {
            System.out.println(f);
            System.out.println(l);
            return;
        }

        char currChar = src.charAt(idx);
        if (currChar == element) {
            if (f == -1) {
                f = idx;
            } else {
                l = idx;
            }
        }
        occurance(src, idx + 1, element);

    }

    public static void main(String[] args) {

        String st = "aassddhagadaa";
        occurance(st, 0, 'a');
    }
}
