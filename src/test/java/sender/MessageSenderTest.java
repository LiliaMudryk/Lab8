package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {

    FacebookUser facebookUser;
    User myFacebookUser;
    TwitterUser twitterUser;
    User myTwitterUser;
    MessageSender sender;
    @BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("myemail@ucu.edu.ua","USA",new Date());
        myFacebookUser = new MyFacebookUser(facebookUser);
        twitterUser = new TwitterUser("myemail1@ucu.edu.ua","China",new Date());
        myTwitterUser = new MyTwitterUser(twitterUser);
        sender = new MessageSender();
    }

    @Test
    void send() {
        assertEquals(sender.send("Hello",myFacebookUser,"USA"),true);
        assertEquals(sender.send("Hello",myFacebookUser,"China"),false);
        assertEquals(sender.send("Hello",myTwitterUser,"USA"),false);
        assertEquals(sender.send("Hello",myTwitterUser,"China"),true);
    }
}