package com.springapp.mvc.model;

/**
 * Created by heval-Computer on 23.2.2015.
 */
public class Customer {

    private long id;
    private String name;
    private String surname;
    private String password;
    private int age;

    public Customer(){

    }

    public Customer(String name, String surname, int age,String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.password = password;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
