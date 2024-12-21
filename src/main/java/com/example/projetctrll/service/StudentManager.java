package com.example.projetctrll.service;

import com.example.projetctrll.dao.entities.Student;
import com.example.projetctrll.dao.repository.StudentRepository;
import com.example.projetctrll.dto.StudentDTO;
import com.example.projetctrll.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService{


    private StudentRepository studentRepository;
    private StudentMapper studentMapper;


    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.fromStudentDTOToStudent(studentDTO);
        Student save = studentRepository.save(student);
        return studentMapper.fromStudentToStudentDTO(save);
    }

    @Override
    public List<StudentDTO> findStudentByDateNaissance(Date dateNaissance) {
        List<Student> students = studentRepository.findByDateNaissance(dateNaissance);
        return studentMapper.fromStudentListToStudentDTOList(students);
    }


    }