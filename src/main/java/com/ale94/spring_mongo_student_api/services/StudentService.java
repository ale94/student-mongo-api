package com.ale94.spring_mongo_student_api.services;

import java.util.List;

import com.ale94.spring_mongo_student_api.dtos.StudentRequest;
import com.ale94.spring_mongo_student_api.entities.StudentDocument;

public interface StudentService {

    List<StudentDocument> findAll();

    StudentDocument findById(String studentId);

    StudentDocument create(StudentRequest request);

    void delete(String studentId);

}
