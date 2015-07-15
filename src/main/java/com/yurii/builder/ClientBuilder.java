package com.yurii.builder;

public class ClientBuilder {

    private int newClientId;
    private String newClientName;
    private String newToken;

    public ClientBuilder() { }

    public ClientBuilder setNewClientId(int newClientId) {
        this.newClientId = newClientId;
        return this;
    }

    public ClientBuilder setNewClientName(String newClientName) {
        this.newClientName = newClientName;
        return this;
    }

    public ClientBuilder setNewToken(String newToken) {
        this.newToken = newToken;
        return this;
    }

    public Client createClient() {
        return new Client(newClientId, newClientName, newToken);
    }

}
