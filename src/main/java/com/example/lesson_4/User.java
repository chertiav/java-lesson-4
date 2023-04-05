package com.example.lesson_4;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String company;
    private String email;
    private String phone;

    public User(int id, String name, int age, String gender, String company, String email, String phone) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }

    public User() {
        super();
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name, user.name) && Objects.equals(gender, user.gender) && Objects.equals(company, user.company) && Objects.equals(email, user.email) && Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, company, email, phone);
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:" + name + '\'' +
                ", age:" + age +
                ", gender:" + gender + '\'' +
                ", company:" + company + '\'' +
                ", email:" + email + '\'' +
                ", phone=:" + phone + '\'' +
                '}';
    }
}
