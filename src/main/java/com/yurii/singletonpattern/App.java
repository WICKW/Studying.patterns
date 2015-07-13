package com.yurii.singletonpattern;

public class App
{
    public static void main( String[] args )
    {
        Client.getInstance().setClientId(0);
        Client.getInstance().setClientName("Yurii");
        System.out.println("Client id: " + Client.getInstance().getClientId());
        System.out.println("Client name: " + Client.getInstance().getClientName());
    }
}
