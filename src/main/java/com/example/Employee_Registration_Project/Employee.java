package com.example.Employee_Registration_Project;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {
    private String name;
    private Date dateOfBirth;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String address;
    private String city;
    private String state;
    @Id
    private String loginId;
    @Column(unique = true)
    private String password;

    public Employee() {
    }

    public Employee(String name, Date dateOfBirth, Gender gender, String address, String city, String state, String loginId, String password) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.state = state;
        this.loginId = loginId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
