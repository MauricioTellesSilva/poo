package ads.poo;

public class Email {
    private String email;

    public Email(String email) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (email.matches(eR)) {
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (email.matches(eR)) {
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "Email{" +
                "Email='" + email + '\'' +
                '}';
    }
}
