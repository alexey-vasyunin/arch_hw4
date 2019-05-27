package arch;

public class AuthOAuth2 extends Auth {
    public AuthOAuth2(UserInterface user) {
        super(user);
        tryAuth();
    }

    @Override
    public boolean isUserAuthOk() {
        return true;
    }

    @Override
    public void tryAuth() {
    }

}
