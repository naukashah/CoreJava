 //If the superclass method does not declare an exception, subclass overridden method 
//cannot declare the checked exception.
// If the superclass method does not declare an exception, subclass overridden method cannot 
//declare the checked exception but can declare unchecked exception.

//If the superclass method declares an exception, subclass overridden method can declare same, 
//subclass exception or no exception but cannot declare parent exception.

public class ExceptionHandling {
	int a,b;
	void devide(int a,int b) { //throw
		this.a = a;
		this.b = b;

		if(b == 0) {
			throw new ArithmeticException ("Message of error");
		} else {
			System.out.println(a/b);
		}
	}
	@SuppressWarnings("null")
	public static void main(String[] args) {

		try {
			@SuppressWarnings("unused")
			int data = 50/0;
			int a[]=new int[5];  
			System.out.println(a[10]);  

			String s=null;  
			System.out.println(s.length());  

		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception Occurs");
		}

		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		}  

		catch(NullPointerException e) {
			System.out.println("NullPointerException Occured");
		}

		catch(Exception e) {
			System.out.println("Parent Exception Occurs");
		}


		try{  //multiple try blocks
			try{  
				System.out.println("going to divide");  
				@SuppressWarnings("unused")
				int b =39/0;  
			}catch(ArithmeticException e){System.out.println(e);}  

			try{  
				int a[]=new int[5];  
				a[5]=4;  
			}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  

			System.out.println("other statement");  
		}catch(Exception e){System.out.println("handeled");}  

		System.out.println("normal flow..");  

		//		finally{
		//			System.out.println("finally block is always executed");
		//		} //finally block
		ExceptionHandling obj1= new ExceptionHandling();
		obj1.devide(12, 0);
	}

}
