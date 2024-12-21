package com.example.projetctrll.web;

import com.example.projetctrll.dto.StudentDTO;
import com.example.projetctrll.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {

    private StudentService studentService;


    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO studentDto){
        return studentService.saveStudent(studentDto);
    }

    @QueryMapping
    public List<StudentDTO> findStudentByDateNaissance(@Argument String dateNaissance){
        return studentService.findStudentByDateNaissance(dateNaissance);
    }


}