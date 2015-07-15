package com.yurii.builder;

public class Client {

    private int clientId;
    private String clientName;
    private String token;

    public Client() {
    }

    public Client(int clientId, String clientName, String token) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.token = token;
    }

    @Override
    public String toString() { // We don't show token
        StringBuilder sb = new StringBuilder();
        sb.append("ClientId: ").append(clientId);
        sb.append("\nClientName: ").append(clientName);
        return sb.toString();
    }
}
