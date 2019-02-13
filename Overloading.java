
public class Overloading { //same method name, different parameters, within the same class
	int total;
	public void sum(int a, int b){
		int x = a;
		int y = b;
		total = x+y;
		System.out.println(total);
	}
	
	public void sum(int x, int y, int z) {
		// TODO Auto-generated constructor stub
		int a = x;
		int b = y;
		int c= z;
		total = a+b+c;
		System.out.println(total);
	}
	
	//public void display() {
	//	System.out.println(total);
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj1 = new Overloading();
		obj1.sum(12, 13);
		obj1.sum(12, 14, 12);
		
		
	}

}
