package arch;

public class Main {
    public static void main(String[] args) {
        Auth auth = new AuthLDAP(new UserOAuth2("alexey"));
        if (auth.isUserAuthOk()) System.out.println("Пользователь аутентифицирован");;
    }
}
