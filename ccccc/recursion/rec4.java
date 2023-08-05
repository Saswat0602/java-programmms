package recursion;

public class rec4 {
    public static void tower(int n, String src ,String help, String dest){
if(n==1){
    System.out.println("transefer disk "+n+" from "+src+" to "+dest);

    return;
}

        tower(n-1, src, dest, help);

        System.out.println("transefer disk "+n+" from "+src+" to "+dest);
        tower(n-1, help, src, dest);
    }
    

    public static void main(String[] args) {
            int n = 5;
            tower(n,"s","h","d");
    }
}
