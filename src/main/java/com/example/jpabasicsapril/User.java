package com.example.jpabasicsapril;

import jakarta.persistence.*;

@Entity                     // tells this field is class in table
@Table(name="user_info")      // not mandatory, optional (change the table name in database)
public class User {

    @Id                                                      // tells this field is primary key in table
    @GeneratedValue(strategy = GenerationType.IDENTITY)      // automatically give userID starting from 1
    private int userId;

    @Column(name = "user_name")
    private String name;

    private int age;

    private String mobile;

    @OneToOne(mappedBy = "user")                  // how to connect parent to child
    private Card card;

    public User() {
    }

    public User(int userId,String name, int age, String mobile) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
