package com.example.ch5ps3;

public class Contact {
    private int sno;
    private String phoneNumber;
    private String name;
    public Contact(int sno, String phoneNumber, String name){
        this.sno = sno;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getName(){
        return name;
    }
}
