package com.ale94.spring_mongo_student_api.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Document(collection = "students")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class StudentDocument {

    @Id
    private String id;
    private String studentId;
    private String name;
    private String email;
    private int age;
    private String gender;
    private String course;
    private double gpa;
    private List<String> skills;
    private LocalDate enrollmentDate;
    private String status;
    private AddressDocument address;
    private String phone;

}
