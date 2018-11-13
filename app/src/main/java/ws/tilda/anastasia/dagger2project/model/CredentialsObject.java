package ws.tilda.anastasia.dagger2project.model;

public class CredentialsObject {
    String apiKey;
    String sessionId;
    String token;

    public CredentialsObject(String apiKey, String sessionId, String token) {
        this.apiKey = apiKey;
        this.sessionId = sessionId;
        this.token = token;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
