package com.example.classrunner;

import com.example.classrunner.Repository.LibCardRepository;
import com.example.classrunner.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LibSystemApplication.class, args);
    }

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    LibCardRepository libCardRepository;

    @Override
    public void run(String... args) throws Exception {
        //as soon as we execute spring boot application whatever is written inside this will run parallel (multi threading)
        //used to test the DB connection
        Student s = new Student(0, "Manjur", 22);
        LibCard card = new LibCard(0, 5);

        s.setCard(card);

        //now we don't need postman to check if this is saved in DB or not
        //if this 2 lines of code gives error then our data is not saved in DB else it is.
        libCardRepository.save(card);
        studentRepository.save(s);
    }
}
