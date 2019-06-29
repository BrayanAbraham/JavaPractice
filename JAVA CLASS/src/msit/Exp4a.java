package msit;

public class Exp4a extends Exp4a1{

	int y;
	void show()
	{
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		
		Exp4a a=new Exp4a();
		a.x=10;
		a.y=20;
		a.show();
	}

}
