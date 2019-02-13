
public interface InterfaceDemo { //Exam Interface
	public void percentage();
	
	static void displayStatic() {
	System.out.println("Can declare static method in interface");
	}
	
	default void displayDefault() {
		System.out.println("Can declare static & default method in interface");
		}
}
