package twitter;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
public class TwitterUser {
    private String email;
    private String country;
    private Date lastActiveTime;
    public TwitterUser(String email,String country,Date lastActiveTime){
        this.email = email;
        this.country =country;
        this.lastActiveTime = lastActiveTime;
    }

    public String getUserMail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public Date getLastActiveTime() {
        return lastActiveTime;
    }


}
