package someprgs;

import java.util.*;


public class paliandromeandperfect {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("1.palliandrome Number");
		System.out.println("2.perfect Number");
		System.out.println("enter your choice");
		int choice  = sc.nextInt();
		System.out.println("enter the number ");
		int num = sc.nextInt();
		int temp  = num ;
		switch(choice)
		{
		case 1:
			int rem,rev= 0;
			while(num>0) {
				rem = num%10;
				rev = rev*10+rem;
				num = num/10;
				
			}
			if(rev==temp)
				System.out.println(temp+"palliandrome  number");
			else
				System.out.println(temp+" not aa palliandrome  number");
			
			break;
		case 2:
			int s= 0,i = 1;
			while(i<num) {
				if(num%i==0)
					s = s+i;
				    i++;
			}
			if(num==s)
				System.out.println(num+"prefect  number");
			else
				System.out.println(num+"not a  perfect number  number");
			break;
			default:
		}

		System.out.println("in valid choice  ");
	}

}