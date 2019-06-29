package msit;

public class Exp3b {
	
	int x;
	int y;
	
	static Exp3b add(Exp3b a, Exp3b b)
	{
		Exp3b c=new Exp3b();
		c.x=a.x+b.x;
		c.y=a.y+b.y;
		return c;
	}

	public static void main(String[] args) {

		Exp3b a=new Exp3b();
		Exp3b b=new Exp3b();
		
		a.x=10;
		a.y=20;
		b.x=30;
		b.y=40;
		
		Exp3b c=add(a,b);
		
		System.out.println(c.x+" "+c.y);
	}

}
