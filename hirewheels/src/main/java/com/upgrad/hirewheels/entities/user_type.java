package com.upgrad.hirewheels.entities;
import javax.persistence.*;
import java.util.Set;

@Entity
public class user_type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_type_id;
    private String user_type_name;
    @OneToMany(mappedBy = "user_type_id")
    private Set<user_type> user_types;
    public int getUser_type_id() {
        return user_type_id;
    }

    public void setUser_type_id(int user_type_id) {
        this.user_type_id = user_type_id;
    }

    public String getUser_type_name() {
        return user_type_name;
    }

    public void setUser_type_name(String user_type_name) {
        this.user_type_name = user_type_name;
    }

    @Override
    public String toString() {
        return "user_type{" +
                "user_type_id=" + user_type_id +
                ", user_type_name='" + user_type_name + '\'' +
                '}';
    }
}

