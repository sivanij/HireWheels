package com.upgrad.hirewheels.entities;


import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @Column(nullable = false)

    private String first_name;

    private  String last_name;


    @Column(nullable = false)
    private int password;
    @Column(nullable = false )
    private String email;

    @Column(nullable = false)
    private int mobile_number;
    private int wallet_money;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(int mobile_number) {
        this.mobile_number = mobile_number;
    }

    public int getWallet_money() {
        return wallet_money;
    }

    public void setWallet_money(int wallet_money) {
        this.wallet_money = wallet_money;
    }


    @Override
    public String toString() {
        return "users{" +
                "user_id=" + user_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobile_number=" + mobile_number +
                ", wallet_money=" + wallet_money +
                '}';
    }
}
