package nextstep.member.application.dto;

public class GithubAccessTokenResponse {

    private String accessToken;

    public GithubAccessTokenResponse() {
    }

    public GithubAccessTokenResponse(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
