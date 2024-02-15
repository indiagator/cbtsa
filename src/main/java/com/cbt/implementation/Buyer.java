package com.cbt.implementation;

public class Buyer extends User //BUYER ENTITY INHERITS STRUCTURE FROM ANOTHER WHICH IS USER
{
    public Buyer(String id, String fullname) {
        super(id, fullname);
    }

    //FIELDS|MEMBERS - HOLD TRANSIENT DATA
    //METHODS - ARE USED TO TRANSFORM THE DATA HELD IN THE FIELDS BY EXPOSING THEM TO OTHER CLASSES|OBJECTS

    public String  placeOrder()
    {
        return "Order Placed";
    }

    @Override
    public String introduce()
    {
        super.introduce();
        return "I am a BUYER";
    }
}
