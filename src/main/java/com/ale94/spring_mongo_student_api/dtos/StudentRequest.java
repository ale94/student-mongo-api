package com.ale94.spring_mongo_student_api.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.ale94.spring_mongo_student_api.entities.AddressDocument;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class StudentRequest implements Serializable {

    private String studentId;
    private String name;
    private String email;
    private int age;
    private String gender;
    private String course;
    private double gpa;
    private List<String> skills;
    private AddressDocument address;
    private String phone;

}
