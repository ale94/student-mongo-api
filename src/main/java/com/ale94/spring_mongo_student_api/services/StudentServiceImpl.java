package com.ale94.spring_mongo_student_api.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ale94.spring_mongo_student_api.dtos.StudentRequest;
import com.ale94.spring_mongo_student_api.entities.StudentDocument;
import com.ale94.spring_mongo_student_api.repositories.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public List<StudentDocument> findAll() {
        return this.repository.findAll();
    }

    @Override
    public StudentDocument findById(String studentId) {
        return this.repository.findByStudentId(studentId).orElseThrow();
    }

    @Override
    public StudentDocument create(StudentRequest request) {
        var studentToPersist = StudentDocument.builder()
                .studentId(request.getStudentId())
                .name(request.getName())
                .email(request.getEmail())
                .age(request.getAge())
                .gender(request.getGender())
                .course(request.getCourse())
                .gpa(request.getGpa())
                .skills(request.getSkills())
                .enrollmentDate(LocalDate.now())
                .status("active")
                .phone(request.getPhone())
                .address(request.getAddress())
                .build();
        var studentPersisted = this.repository.save(studentToPersist);
        return studentPersisted;
    }

    @Override
    public void delete(String studentId) {
        var studentToDelete = this.repository.findByStudentId(studentId).orElseThrow();
        this.repository.delete(studentToDelete);
    }

}
