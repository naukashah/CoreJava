
public class GarbageCollection {
	public void finalize() {
		System.out.println("Object is garbage collected.");
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		GarbageCollection g1 = new GarbageCollection();
		@SuppressWarnings("unused")
		GarbageCollection g2 = new GarbageCollection();
		g1= null;
		g2= null;
		System.gc();
	}

}
