package pojos;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class LoginPojo {

    private String email;
    private String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginPojo(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public LoginPojo() {

    }

    @Override
    public String toString() {
        return "LoginPojo{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
