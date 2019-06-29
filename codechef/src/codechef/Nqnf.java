package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class Nqnf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int q=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
		    a[i]=scan.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
		    b[i]=scan.nextInt();
		}
		while(q>0)
		{
		    q--;
		    int t=scan.nextInt();
		    if(t==1)
		    {
		        int l=scan.nextInt();
                int r=scan.nextInt();
                l=l-1;
                r=r-1;
                int z=r-l+1;
                int s[]=new int[z];
                for(int i=0;i<z;i++)
                {
                    s[i]=a[l+i];
                }
                Arrays.sort(s);
                System.out.println(s[z-1]);
		    }
		    if(t==2)
		    {
		        int l=scan.nextInt();
                int r=scan.nextInt();
                l=l-1;
                r=r-1;
                int z=r-l+1;
                for(int i=0;i<z;i++)
                {
                    a[l+i]+=b[l+i];
                }
		    }
		    if(t==3)
		    {
		    	int l=scan.nextInt();
                int r=scan.nextInt();
                int x=scan.nextInt();
                l=l-1;
                r=r-1;
                int z=r-l+1;
                for(int i=0;i<z;i++)
                {
                	b[l+i]+=x;
                }
		    }
		    if(t==4)
		    {
		    	int l=scan.nextInt();
                int r=scan.nextInt();
                l=l-1;
                r=r-1;
                int z=r-l+1;
                int x=scan.nextInt();
                for(int i=0;i<z;i++)
                {
                	a[l+i]+=x;
                }
		    }
		}
	}

}
