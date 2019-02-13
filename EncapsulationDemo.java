
public class EncapsulationDemo {
	private String name;
	public int age;
	static String mname;
	EncapsulationDemo(String name, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		System.out.println("Age : " + age);
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}
	public void setName(String a) {
		name = a;
	}
	public String getMname() {
		System.out.println("Name : " + mname);
		return mname;
	}
	public void setmname(String b) {
		mname = b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo obj1 = new EncapsulationDemo("Nauka", 25);
		EncapsulationDemo.mname = "JNS";
		obj1.setAge(12);
		obj1.setName("Na");
		obj1.getAge();
		obj1.getName();
		obj1.getMname();
		EncapsulationDemo obj2 = new EncapsulationDemo("Navik",25);
		obj2.getAge();
		obj2.getName();
		obj2.getMname();
	}

}
