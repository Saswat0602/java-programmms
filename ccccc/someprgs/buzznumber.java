package someprgs;

import java.util.*;

class buzznumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbr");
        int num = sc.nextInt();
        if(num%10==7||num%7==0)
        System.out.println("the number is   A buzz number");
        else
        System.out.println("num is not a buzz number");
        
        
    }
}