package com.hogwarts.school.service;

import com.hogwarts.school.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {
    private final Map<Long, Student> studentMap = new HashMap<>();
    private Long studentId = 1l;

    public Student createStudent(Student student) {
        studentMap. put(studentId, student);
        studentId++;
        return student;
    }

    public Student getStudentById(Long id) {
        return studentMap.get(id);
    }

    public Student updateStudent(Long id, Student student) {
        studentMap.put(id, student);
        return student;
    }

    public Student deleteStudent(Long id) {
        return studentMap.remove(id);
    }
}
