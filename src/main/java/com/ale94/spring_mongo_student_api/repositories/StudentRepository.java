package com.ale94.spring_mongo_student_api.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ale94.spring_mongo_student_api.entities.StudentDocument;


public interface StudentRepository extends MongoRepository<StudentDocument, String>{

    Optional<StudentDocument> findByStudentId(String studentId);
}
