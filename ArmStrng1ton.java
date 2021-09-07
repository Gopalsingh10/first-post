package project12;
import java.util.Scanner;
public class ArmStrng1ton {

	
		public static void main(String srgs[])
		{
			int n,num,num1,arm=0,temp,rev,temp1;
		
			Scanner gg=new Scanner(System.in);
			
			System.out.println("Enter a number :: ");
			n=gg.nextInt();
			
			System.out.println("Armstrong numbers between 1 to "+n+" = ");
			for(int j=100;j<=n;j++)
			{
				temp=j;
				arm=0;
				temp1=j;
				for(int i=0;i<=3;i++)
				{
					num=0;
					rev=temp1%10;
					num=num*10+rev;
					temp1=temp1/10;
				
					num1=num*num*num;
				
					arm=arm+num1;
				}
				
				if(temp==arm)
				{
					System.out.println(" "+arm);
				}
			}
			
		}
	}
