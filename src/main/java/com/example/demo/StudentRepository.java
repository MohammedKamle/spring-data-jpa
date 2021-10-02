package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Long is the data type of primary key which is id
public interface StudentRepository extends JpaRepository<Student, Long>{

}
