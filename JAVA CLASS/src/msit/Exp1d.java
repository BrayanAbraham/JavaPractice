package msit;

public class Exp1d {

	public static void main(String[] args) {
		
		for(int i=0;i<9;i++)
		{
			if(i<=4)
			{
				for(int k=0;k<=5-i;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=(2*i)+1;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int k=0;k<=i-3;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=(2*(9-i)-1);j++)
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}

	}

}
