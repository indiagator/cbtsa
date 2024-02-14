package com.cbt.implementation;

import java.sql.Timestamp;

public class Payment { //ENTITY

    public Payment()
    {

    }

    public Payment(String id)
    {
        this.id = id;
    }

    private String id;

    private String payer;

    private String payee;

    private Integer amount;

    private Timestamp timestamp;
}
