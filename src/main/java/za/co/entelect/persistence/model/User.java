package za.co.entelect.persistence.model;


import java.time.LocalDate;


public class User {
    private String email;
    private String password;
    private LocalDate dob;

    public User() {
    }

    public User(String email, String password, LocalDate dob) {
        this.email = email;
        this.password = password;
        this.dob = dob;
    }

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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
