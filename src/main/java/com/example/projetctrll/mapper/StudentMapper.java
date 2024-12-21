package com.example.projetctrll.mapper;

import com.example.projetctrll.dao.entities.Student;
import com.example.projetctrll.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Student fromStudentDTOToStudent(StudentDTO studentDTO){
        return mapper.map(studentDTO, Student.class);
    }

    public StudentDTO fromStudentToStudentDTO(Student student){
        return mapper.map(student, StudentDTO.class);
    }


    public List<StudentDTO> fromStudentListToStudentDTOList(List<Student> students){
        List<StudentDTO> studentsDto = new ArrayList<>();
        for (Student student : students){
            StudentDTO map = mapper.map(student, StudentDTO.class);
            studentsDto.add(map);
        }
        return studentsDto;
    }



}
