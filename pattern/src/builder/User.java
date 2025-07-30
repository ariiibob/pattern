package builder;

public class User {
    // 필수 파라미터
    private final String username;
    private final String email;

    // 선택 파라미터
    private final int age;
    private final String phone;

    // private 생성자
    private User(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public static class Builder {
        // 필수
        private final String username;
        private final String email;

        // 선택
        private int age = 0;
        private String phone = "";

        public Builder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
