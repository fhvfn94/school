package com.hogwarts.school.service;

import com.hogwarts.school.model.Faculty;
import com.hogwarts.school.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FacultyService {
    private final Map<Long, Faculty> facultyMap = new HashMap<>();
    private Long facultyId = 1l;

    public Faculty createFaculty(Faculty faculty) {
        facultyMap.put(facultyId, faculty);
        facultyId++;
        return faculty;
    }

    public Faculty getFacultyById(Long id) {
        return facultyMap.get(id);
    }

    public Faculty updateFaculty(Long id, Faculty faculty) {
        facultyMap.put(id, faculty);
        return faculty;
    }

    public Faculty deleteFaculty(Long id) {
        return facultyMap.remove(id);
    }
}
