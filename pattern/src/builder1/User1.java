package builder1;

public class User1 {
	
	private String name;
	private String email;
	private int age;
	private String phone;
	
	private User1() {
		
	}
	
	public class builder {
		String name;
		String email;
		int age;
		String phone;
		
		public builder(String name, String email) {
			this.name = name;
			this.email = email;
		}
		
		public builder age(int age) {
			this.age = age;
			return this;
		}
	}

}
