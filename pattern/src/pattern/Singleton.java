package pattern;

public class Singleton {
	
	private static Singleton ist;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (ist == null) {
			ist = new Singleton();
		}
		return ist;
	}

}
