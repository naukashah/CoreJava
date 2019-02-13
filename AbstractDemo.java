
public abstract class AbstractDemo {
	public abstract void area(int a);
	
	public static class Circle extends AbstractDemo{

		@Override
		public void area(int a) {
			// TODO Auto-generated method stub
			double area= 3.4*a*a;
			System.out.println("Area of circle :" + area);
		}
		
	}
	public static void main(String args[]) {
		System.out.println("Test");
		
		Circle obj1 = new AbstractDemo.Circle(); 
		obj1.area(15);
		
		
		//We can also access inner class object by objectname.new classname();
		//for that main class shouldn't be abstract
	}
}

