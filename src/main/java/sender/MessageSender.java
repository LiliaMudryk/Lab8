package sender;

public class MessageSender {
    public boolean send(String text,User user,String country){
        if (user.getCountry().equals(country)) {
            System.out.println(text);
            return true;
        }
        return false;
    }
}
