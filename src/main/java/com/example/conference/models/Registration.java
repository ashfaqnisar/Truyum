package com.example.conference.models;

public class Registration {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
