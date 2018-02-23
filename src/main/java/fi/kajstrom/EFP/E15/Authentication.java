package fi.kajstrom.EFP.E15;

import org.mindrot.jbcrypt.BCrypt;

import java.util.HashMap;
import java.util.Map;

public class Authentication {
    private Map<String, String> credentials = new HashMap<>();

    public Authentication() {
        credentials.put("kajstrom", hashPw("password"));
        credentials.put("someone", hashPw("r00t"));
    }

    public boolean isValid(String username, String password) {
        if (credentials.containsKey(username) == false) {
            return false;
        }

        if (BCrypt.checkpw(password, credentials.get(username))) {
            return true;
        }

        return false;
    }

    private String hashPw(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
