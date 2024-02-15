package com.cbt.implementation;

public class MyNumber
{
    private int value;
    private Object ;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int incrementValue()
    {

        return ++this.value;
    }

    public int incrementOtherValue(MyNumber num)
    {
        return num.incrementValue();
    }
}
