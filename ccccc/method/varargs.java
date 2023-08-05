package method;

class varargs{
    static int add(int ...arr){
        int result =0;
        for(int i =0;i<=arr.length-1;i++){
            result+=arr[i];
        }
        return result;
        
    }

    public static void main(String[] args) {
        System.out.println(add(4,5,6));
        System.out.println(add(4,45,6));
        System.out.println(add(4,53,6));
        System.out.println(add(4,5,5,78,63));
    }
}