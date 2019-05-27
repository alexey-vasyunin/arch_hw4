package arch;

public class AuthLDAP extends Auth {
    boolean isServerOk = false;

    public AuthLDAP(UserInterface user) {
        super(user);
        tryAuth();
    }

    @Override
    public boolean isUserAuthOk() {
        return true;
    }

    @Override
    public void tryAuth() {
        // connect to ldap-server and try to get authenticate
    }

    public boolean isLdapServerConnected(){
        return isServerOk;
    }

    public String getServerVersion(){
        return "ver 3.14";
    }
}
