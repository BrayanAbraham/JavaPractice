package msit;

public class Exp3a extends Exp3a1 {

	Exp3a()
	{
		super();
	}
	Exp3a(int a)
	{
		super(a);
	}
	
	Exp3a(int a, int b)
	{
		super(a,b);
	}
	
	
	void show()
	{
		System.out.println(a + " " + b);
	}
	
	
	public static void main(String[] args) {
		
		Exp3a a,b,c;
		a= new Exp3a();
		b= new Exp3a(60);
		c= new Exp3a(50, 100);
		a.show();
		b.show();
		c.show();
	}

}
