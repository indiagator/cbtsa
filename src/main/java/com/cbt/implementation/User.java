package com.cbt.implementation;

import com.cbt.api.Communicable;
import com.cbt.api.Editable;
import com.cbt.api.Removable;

public class User implements Editable, Removable, Communicable //ENTITY EXTENDS OBJECT CLASS
{
    //ATTRIBUTES
    private final String id; // IMMUTABLE FIELD
    private final String fullname; // IMMUTABLE FIELD
    private String phone;
    private String email;
    private String company;
    public static final float PI = (float)3.14; //BELONGS TO THE CLASS AND NOT TO THE FUTURE OBJECTS


    public User(String id, String fullname)
    {
        this.id = id; // INITIALIZATION OF AN IMMUTABLE FIELD
        this.fullname = fullname; // INITIALIZATION OF AN IMMUTABLE FIELD
    }

    public User(String id, String fullname, String phone, String email) //OPTIONAL OVERLOADED CONSTRUCTOR
    {
        this.id = id; // INITIALIZATION OF AN IMMUTABLE FIELD
        this.fullname = fullname; // INITIALIZATION OF AN IMMUTABLE FIELD

        this.phone = phone; // OPTIONAL INITIALIZATION
        this.email = email; // OPTIONAL INITIALIZATION
    }

    public static float getPi() // BELONGS TO THE CLASS AND NOT TO THE FUTURE OBJECTS
    {
        return PI;
    }

    public String getUserHash()
    {
        return id.concat(fullname);
    }

    public String getUserHash(String mode)
    {
        return fullname.concat(id);
    }

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString()
    { //BODY
        return "User{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override //Inherited from Object Class
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override //Inherited from Object Class
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void updateEmail(String email) {

        //BODY

    }

    @Override
    public void updatePhone(String phone) {

        // PLEASE DO NOT PUT GARBAGE CODE HERE

    }

    @Override
    public void updateCompany(String company) {

        //BODY

    }

    @Override
    public void updateFullname(String fullname) {


    }

    @Override
    public void remove() {

        //remove(this); DATABASE RELATED CODE WHICH WILL DELETE THE USER RECORD
    }

    @Override
    public String introduce() {
        return null;
    }
}
