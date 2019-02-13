
public class InheritanceIsA {
	String name;
	int age;
	public InheritanceIsA(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
	public class Department extends InheritanceIsA{
		String dept;
		public Department(String name, int age, String dept) {
			super(name, age);
			// TODO Auto-generated constructor stub
			this.dept = dept;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceIsA ob1 = new InheritanceIsA("Nauka", 12);
		InheritanceIsA.Department obj2 = ob1.new Department("Navik", 12, "HR");
		System.out.println("Department" + obj2.age + obj2.name + obj2.dept);
		System.out.println("Detail from super :"+ ob1.age + ob1.name);

	}

}
