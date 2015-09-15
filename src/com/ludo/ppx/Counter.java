package com.ludo.ppx;

public class Counter {

    private int i;

    public Counter() {
        this(0);
    }

    public Counter(int i) {
        this.i = i;
    }

    public void inc() {
        i++;
    }

    public void dec() {
        i--;
    }

    public int value() {
        return i;
    }

    public boolean isDone() {
        return i == 0;
    }

    public boolean isPositive() {
        return i > 0;
    }

    public boolean isNotZero() {
        return i != 0;
    }

    public boolean isSomething() {
        return i == 34874;
    }

    public boolean isSomethingElse() {
        return i == 23423;
    }

    public boolean isBr3Only() {
        return i == 33;
    }
}
