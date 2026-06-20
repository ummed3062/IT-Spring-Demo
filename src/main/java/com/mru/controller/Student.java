package com.mru.controller;

public class Student {
    
    int id;
    String name;
    int age;
    String department;
    String address;

    public Student(int id, String name, int age, String department, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.address = address;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;  
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
