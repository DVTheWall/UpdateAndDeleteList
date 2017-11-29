package com.example.demowithradibutton;

/**
 * Created by peacock on 3/11/16.
 */
public class User {
    int Id;
    String Name;
    String Email;
    String Mobile;
    String Gender;

    public User() {
    }

    public User(int id, String name, String email, String mobile, String gender) {
        this.Id = id;
        this.Name = name;
        this.Email = email;
        this.Mobile = mobile;
        this.Gender = gender;
    }

    public User(String name, String email, String mobile, String gender) {
        this.Name = name;
        this.Email = email;
        this.Mobile = mobile;
        this.Gender = gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        this.Mobile = mobile;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }
}
