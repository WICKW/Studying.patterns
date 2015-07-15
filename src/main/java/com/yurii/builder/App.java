package com.yurii.builder;

public class App {
    public static void main(String[] args) {

        Client clientJohn = new ClientBuilder().setNewClientId(0)
                .setNewClientName("John")
                .setNewToken("w0tlvt3x6fust+i7+utV+ZXhsrZa1oA/")
                .createClient();

        Client clientBob = new ClientBuilder().setNewClientId(1)
                .setNewClientName("Bob")
                .setNewToken("JCPufpcQ9EYn+7/L+4gGBkvcW1NAAjna")
                .createClient();

        System.out.println(clientJohn.toString());
        System.out.println();
        System.out.println(clientBob.toString());
    }
}
