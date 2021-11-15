package facebook;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
public class FacebookUser {
    private String email;
    private String country;
    private Date lastActiveTime;
    public FacebookUser(String email,String country,Date lastActiveTime){
        this.email = email;
        this.country =country;
        this.lastActiveTime = lastActiveTime;
    }

    public String getEmail() {
        return email;
    }

    public String getUserCountry() {
        return country;
    }

    public Date getUserLastActiveTime() {
        return lastActiveTime;
    }
}