package msit;

public class Exp3a1 {
	int a;
	int b;
	
	Exp3a1()
	{
		a=10;
		b=20;
	}
	
	Exp3a1(int a)
	{
		this.a=a;
		b=20;
	}
	Exp3a1(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println("Parent class");
	}
}
