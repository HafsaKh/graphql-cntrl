package com.example.projetctrll.service;

import com.example.projetctrll.dto.StudentDTO;

import java.util.Date;
import java.util.List;

public interface StudentService {
    StudentDTO saveStudent(StudentDTO studentDTO);
    List<StudentDTO> findStudentByDateNaissance(Date dateNaissance);
}
