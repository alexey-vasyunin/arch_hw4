package arch;

import java.time.LocalDateTime;

public interface UserInterface {
    String getEmail();
    String getUsername();
    void setUsername(String username);
    LocalDateTime getLastVisit();
}
