package msit;

public class Exp3c extends Exp3a1{

	int a;
	int b;
	
	Exp3c(int a, int b)
	{
		super(a,b);
		this.a=80;
		this.b=100;
	}
	void display()
	{
		System.out.println("Child class");
	}
	
	void show()
	{
		display();
		super.display();
		System.out.println(a+" "+b);
		System.out.println(super.a+ " "+ super.b);
	}
	public static void main(String[] args) {

		Exp3c a= new Exp3c(40,50);
		
		a.show();
	}
}
