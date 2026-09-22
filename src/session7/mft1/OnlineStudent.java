package session7.mft1;

public final class OnlineStudent extends Student{

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public OnlineStudent setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public OnlineStudent setPassword(String password) {
        this.password = password;
        return this;
    }
}
