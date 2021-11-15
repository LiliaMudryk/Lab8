package EngAdapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationEngTest {
    AuthorizationEng auth;
    DataBaseEng db;
    @BeforeEach
    void setUp() {
        auth = new AuthorizationEng();
        db = new DataBaseEng();
    }

    @Test
    void authorize() {
        assertEquals(auth.authorize(db),true);
    }
}