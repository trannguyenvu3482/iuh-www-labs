package com.fit.se.lab03.entity;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private String day;
    private String month;
    private String year;
    private String email;
    private String mobileNum;
    private String gender;
    private String address;
    private String city;
    private String pinCode;
    private String state;
    private String country;
    private String[] hobbies;
    private String course;

    public Student() {
    }

    public Student(String firstName, String lastName, String day, String month, String year, String email, String mobileNum, String gender, String address, String city, String pinCode, String state, String country, String[] hobbies, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.mobileNum = mobileNum;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
        this.country = country;
        this.hobbies = hobbies;
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", email='" + email + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", course='" + course + '\'' +
                '}';
    }
}
