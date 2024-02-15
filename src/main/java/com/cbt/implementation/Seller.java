package com.cbt.implementation;

public class Seller extends User//ENTITY
{

    public Seller(String id, String fullname) {
        super(id, fullname);
    }

    @Override
    public String introduce()
    {
        return "I am a Seller";
    }
}
