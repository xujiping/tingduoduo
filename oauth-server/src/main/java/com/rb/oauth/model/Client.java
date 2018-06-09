package com.rb.oauth.model;

/**
 * @author xujiping
 * @date 2018/6/8 16:44
 */
public class Client {

    private Long id;
    private String name;
    private String clientId;
    private String secret;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clientId='" + clientId + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
