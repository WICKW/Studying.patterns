package com.yurii.iterator;

public class App {
    public static void main(String[] args) {

        MonthRepo mr = new MonthRepo();

        String month;
        for (Iterator iterator = mr.getIterator(); iterator.hasNext();) {
            month  = (String) iterator.next();
            System.out.println("month: " + month);
        }

    }
}
