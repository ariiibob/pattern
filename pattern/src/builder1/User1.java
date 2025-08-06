package builder1;

public class User1 {
	
	private final String name;
	private final String email;
	private final int age;
	private final String phone;
	
	private User1(builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
	}
	
	public static class builder {
		
		private final String name;
		private final String email;
		
		private int age = 0;
		private String phone = "";
		
		public builder(String name, String email) {
			this.name = name;
			this.email = email;
		}
		
		public builder age(int age) {
			this.age = age;
			return this;
		}
		
		public builder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
        public User1 build() {
            return new User1(this);
        }
	}

}
