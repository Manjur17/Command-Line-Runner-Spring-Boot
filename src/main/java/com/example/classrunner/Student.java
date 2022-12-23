package com.example.classrunner;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremented primary key in database
    int id; //cannot be private as database will have access to it also and cannot give this inside constructor as it is auto incrementing
    private String name;
    private int age;

    @CreatedDate
    private Date creationDate;

    @UpdateTimestamp
    private Date updateDate;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id; //give some default value to primary key of database
        this.name = name;
        this.age = age;
    }

    @OneToOne //mentioning foreign keys
    @JoinColumn //by default, it will join based on primary key
    private LibCard card;

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

    public LibCard getCard() {
        return card;
    }

    public void setCard(LibCard card) {
        this.card = card;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
