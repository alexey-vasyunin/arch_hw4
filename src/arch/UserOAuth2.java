package arch;


import java.time.LocalDateTime;

public class UserOAuth2 implements UserInterface{
    private String id;
    private String name;
    private String userpic;
    private String email;
    private String gender;
    private String locale;
    private LocalDateTime lastVisit;

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public void setUsername(String username) {
        id = username;
    }

    @Override
    public LocalDateTime getLastVisit() {
        return null;
    }

    public UserOAuth2(String usename) {
        this.id = usename;
    }
}
