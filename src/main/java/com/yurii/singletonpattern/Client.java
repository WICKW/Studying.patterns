package com.yurii.singletonpattern;

public class Client {

    private int clientId;
    private String clientName;

    public Client(){
        this.clientId = -1;
        this.clientName = null;
    }

    private static class ClientSingletonHolder {
        private static final Client instance = new Client();
    }

    public static Client getInstance() {
        return ClientSingletonHolder.instance;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
