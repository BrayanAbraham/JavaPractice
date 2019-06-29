package msit;

import java.util.Scanner;

public class Exp2c {

	static void sort(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			int s=i;
			for(int j=i;j<ar.length;j++)
			{
				if(ar[j]<ar[s])
				{
					s=j;
				}
			}
			int t=ar[s];
			ar[s]=ar[i];
			ar[i]=t;
		}
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=scan.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter elements in array:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		System.out.println("ARRAY:");
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
		
		sort(ar);
		
		System.out.println("Sorted Array:");
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
		
		System.out.println("Enter Element to be searched:");
		int t= scan.nextInt();
		int f=0;
		int i=0;
		int j=ar.length-1;
		while(i<=j)
		{
			int m=(i+j)/2;
			if(ar[m]==t)
			{
				System.out.println("Element found at "+m);
				f=1;
				break;
			}
			else if(ar[m]>t)
			{
				j=m-1;
			}
			else
			{
				i=m+1;
			}
		}
		
		if(f==0)
		{
			System.out.println("Element not found");
		}
		
	}

}
