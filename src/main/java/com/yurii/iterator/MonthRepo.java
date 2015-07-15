package com.yurii.iterator;

public class MonthRepo implements Container {

    public String [] month = {
            "JANUARY",
            "FEBRUARY",
            "MARCH",
            "APRIL",
            "MAY",
            "JUNE",
            "JULY",
            "AUGUST",
            "SEPTEMBER",
            "OCTOBER",
            "NOVEMBER",
            "DECEMBER"
    };

    public Iterator getIterator() {
        return new MonthIterator();
    }

    private class MonthIterator implements  Iterator {

        int index;

        public boolean hasNext() {
            if (index < month.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return month[index++];
            }
            return null;
        }
    }
}
