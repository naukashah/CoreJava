
public class Overriding extends Overloading{ //same method within child class implementation
	public void sum(int x, int y, int z) {
		// TODO Auto-generated constructor stub
		int a = x;
		int b = y;
		int c= z;
		total = a+b+c;
		System.out.println(total);
	}
	
	public static void main(String args[]) {
		Overloading o1 = new Overloading();
		o1.sum(12,12,12);
		
		Overriding o2 = new Overriding();
		o2.sum(12,12,12);
	}
}
