package com.example.classrunner;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Card") //in database the name of table will be Card and not LibCard
public class LibCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private int fine;

    @CreatedDate
    private Date creationDate; //creates a column date for our database and uses system time

    public LibCard() {
    }

    public LibCard(int id, int fine) {
        this.id = id; //give some default value to primary key
        this.fine = fine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}
