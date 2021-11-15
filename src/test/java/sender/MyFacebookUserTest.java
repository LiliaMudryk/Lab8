package sender;

import static org.junit.jupiter.api.Assertions.*;


import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Date;


class MyFacebookUserTest {
    FacebookUser user;
    User myUser;
    @BeforeEach
    void setUp() {
        user = new FacebookUser("myemail@ucu.edu.ua","USA",new Date());
        myUser = new MyFacebookUser(user);
    }

    @Test
    void getCountry() {
        assertEquals(myUser.getCountry(),user.getUserCountry());
    }

    @Test
    void getEmail() {
        assertEquals(myUser.getEmail(),user.getEmail());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(myUser.getLastActiveTime(),user.getUserLastActiveTime());
    }
}