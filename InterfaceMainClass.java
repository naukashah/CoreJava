
public class InterfaceMainClass extends Student implements InterfaceDemo {
	public InterfaceMainClass(String name, int sub1, int sub2, int sub3) {
		super(name, sub1, sub2, sub3);
		// TODO Auto-generated constructor stub
	}

	//Result Class which will extend Students and will implement interface Exam
	// Interface methods has to be implemented in the class which implements it 
	//Interface cannot have constructor
	//all methods and variables are static and final if declared in Interface
	
	//If we have defined constructor with the arguments in the base class then have to define them
	//if we have extended the main class 
	int total;
	float percentage;

	public void percentage() {
		total = sub1+ sub2 + sub3;
		percentage = (total*100)/300;
	}
	void display() {
		System.out.println("Name: " + name + " Sub1 : " + sub1 +" Sub2 : " + sub2 +" Sub3 : " + sub3);
		System.out.println("Total : " + total);
		System.out.println("Percentage: " + percentage);
	}

	@SuppressWarnings("null")
	public static void main(String args[]) {
		InterfaceMainClass obj1 = new InterfaceMainClass("Nauka", 90, 90, 90);
		obj1.percentage();
		obj1.display();
		InterfaceDemo.displayStatic();
	
		InterfaceDemo objInterface = null;
		objInterface.displayDefault();
		InterfaceDemo.displayStatic(); //can access static method of the Interface by 
											//interfaceName.methodName();
		
	}
}
