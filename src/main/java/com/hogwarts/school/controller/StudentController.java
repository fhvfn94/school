package com.hogwarts.school.controller;

import com.hogwarts.school.model.Faculty;
import com.hogwarts.school.model.Student;
import com.hogwarts.school.service.StudentService;
import org.springframework.web.bind.annotation.*;
@RequestMapping("student")
@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("{id}")
    public Student getStudentById( @PathVariable Long id) {
        return studentService.getStudentById(id);
    }
    @PutMapping
    public Student updateStudent(@RequestBody Long id, Student student) {
        return studentService.updateStudent(id, student);
    }
    @DeleteMapping({"id"})
    public Student deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}
