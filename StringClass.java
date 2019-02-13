
public class StringClass {

	public static void main(java.lang.String[] args) {
		String s1 = new String("Nauka");
		String s2 = "Shah";
		String s3 = "Nauka";
		
		if(s1.equals(s2)) { System.out.println("Same: " + s1 + s2);}
		else {System.out.println("Not Same : " + s1 + s2);}
		
		if(s1.equals(s3)) { System.out.println("Same: " + s1 + s3);}
		else {System.out.println("Not Same: "+ s1 + s3);}
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.concat(s2));
		System.out.println(s1 + " And " + s2);
		
		System.out.println(s1.contains("u"));
		
		System.out.println(s1.length());
		
		System.out.println(s1.replace("a", "b"));
		
		System.out.println(s1.toCharArray());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1);
	}

}
