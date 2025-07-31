package builder;

public class Main {

	public static void main(String[] args) {
		
        User user = new User.Builder("hong", "hong@example.com")
                .age(25)
                .phone("010-1234-5678")
                .build();

        System.out.println(user);

	}

}
