package pojo;

public class ResponseUser {

    private String accessToken;
    private String refreshToken;
    private boolean success;
    private ResponseUserInfo user;

    public ResponseUser(String accessToken, String refreshToken, boolean success, ResponseUserInfo user) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.success = success;
        this.user = user;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public boolean isSuccess() {
        return success;
    }

    public ResponseUserInfo getUser() {
        return user;
    }

    public void setUser(ResponseUserInfo user) {
        this.user = user;
    }
}
