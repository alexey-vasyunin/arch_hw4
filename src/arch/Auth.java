package arch;

public abstract class Auth {
    private UserInterface user;
    public Auth(UserInterface user) {
        this.user = user;
    }
    public abstract boolean isUserAuthOk();
    public abstract void tryAuth();
}
