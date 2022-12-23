package com.example.classrunner.Repository;

import com.example.classrunner.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
