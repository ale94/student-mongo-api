package com.ale94.spring_mongo_student_api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ale94.spring_mongo_student_api.dtos.StudentRequest;
import com.ale94.spring_mongo_student_api.entities.StudentDocument;
import com.ale94.spring_mongo_student_api.services.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public ResponseEntity<List<StudentDocument>> getAll() {
        return ResponseEntity.ok(this.service.findAll());
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<StudentDocument> getById(@PathVariable String studentId) {
        return ResponseEntity.ok(this.service.findById(studentId));
    }

    @PostMapping
    public ResponseEntity<StudentDocument> save(@RequestBody StudentRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.create(request));
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> delete(@PathVariable String studentId) {
        this.service.delete(studentId);
        return ResponseEntity.noContent().build();
    }

}
