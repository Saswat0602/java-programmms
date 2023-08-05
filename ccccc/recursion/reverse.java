package recursion;

public class reverse {
    public static void pritnrev(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;

        }
        System.out.print(str.charAt(idx));
pritnrev(str, idx-1);

    }
    public static void main(String[] args) {
        String str = "saswat";
        pritnrev(str, str.length()-1);
        
    }
}
