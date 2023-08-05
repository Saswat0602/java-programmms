package someprgs;

import java.util.Scanner;

 class menudriven {

	private static final Scanner in = null;

    public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Fibbonacci series");
		System.out.println("2. sum of digits ");
		System.out.println("Enter ur choice");
		
		int choice = in.nextInt();
		System.out.println("enter the number");
		int num = in.nextInt();
		int a= 0,b=1,c=0,rem,sum=0,i=1;
		switch(choice)
		{
		case 1:
			while(i<=num) {
				System.out.println(" "+c);
				a= b;
				b=c;
				c=a+b;
				i++;
				
				
			}
		break;
		case 2:
			while(num>0)
			{
				rem = num%10;
				sum = sum+rem;
				num = num/10;
				
			}
			System.out.println("the sum of the digit is "+sum);
		}
		

	}

}