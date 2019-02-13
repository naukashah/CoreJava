
public class AbstractDemo2 extends AbstractDemo{
	@Override
	public void area(int a) {	
		// TODO Auto-generated method stub
		int area = a*a;
		System.out.println("Area: " + area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDemo2 obj = new AbstractDemo2();
		obj.area(10);
	}

}
