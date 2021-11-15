package sender;

import facebook.FacebookUser;
import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User{
    private TwitterUser user;
    public MyTwitterUser(TwitterUser user){
        this.user=user;
    }
    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getLastActiveTime();
    }
}
