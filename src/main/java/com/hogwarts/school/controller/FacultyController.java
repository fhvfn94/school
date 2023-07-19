package com.hogwarts.school.controller;

import com.hogwarts.school.model.Faculty;
import com.hogwarts.school.service.FacultyService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("faculty")
@RestController
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }
    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return facultyService.createFaculty(faculty);
    }

    @GetMapping("{id}")
    public Faculty getFacultyById( @PathVariable Long id) {
        return facultyService.getFacultyById(id);
    }
    @PutMapping
    public Faculty updateFaculty(@RequestBody Long id, Faculty faculty) {
        return facultyService.updateFaculty(id, faculty);
    }
    @DeleteMapping({"id"})
    public Faculty deleteFaculty(@PathVariable Long id) {
        return deleteFaculty(id);
    }
}
