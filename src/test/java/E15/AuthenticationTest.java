package E15;

import fi.kajstrom.EFP.E15.Authentication;
import static org.junit.Assert.*;
import org.junit.Test;

public class AuthenticationTest {
    @Test
    public void isValid_WithNonExistingUser_ReturnsFalse() {
        Authentication auth = new Authentication();

        assertFalse(auth.isValid("nosuchuser", "1234"));
    }

    @Test
    public void isValid_WithExistingUserAndInvalidPassword_ReturnsFalse() {
        Authentication auth = new Authentication();

        assertFalse(auth.isValid("kajstrom", "wordpass"));
    }

    @Test
    public void isValid_WithExistingUserAndValidPassword_ReturnsTrue() {
        Authentication auth = new Authentication();

        assertTrue(auth.isValid("kajstrom", "password"));
    }
}
