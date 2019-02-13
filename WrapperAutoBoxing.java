
public class WrapperAutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(12);
		//Auto Boxing - converting primitive to Object without new keyword
		Integer i2 = 23;
		
		//Auto unboxing - converting Object to primitive without new keyword
		int i3 =i2;
		System.out.println(i + " -- " + i2 + "  " + i3);
	}
}
