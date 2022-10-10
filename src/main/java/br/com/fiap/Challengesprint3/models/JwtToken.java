package br.com.fiap.Challengesprint3.models;

public class JwtToken {

    private String token;

    private String type;

    public JwtToken() {}

    public JwtToken(String token) {
        this.token = "Bearer " + token;
    }

    public JwtToken(String token, String type) {
        this.token = token;
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
