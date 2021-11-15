package sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    TwitterUser user;
    User myUser;
    @BeforeEach
    void setUp() {
        user = new TwitterUser("myemail@ucu.edu.ua","USA",new Date());
        myUser = new MyTwitterUser(user);
    }

    @Test
    void getCountry() {
        assertEquals(myUser.getCountry(),user.getCountry());
    }

    @Test
    void getEmail() {
        assertEquals(myUser.getEmail(),user.getUserMail());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(myUser.getLastActiveTime(),user.getLastActiveTime());
    }
}