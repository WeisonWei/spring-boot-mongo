package com.weison.sbm.repository;

import com.weison.sbm.domain.Student;
import com.weison.sbm.domain.StudentScore;
import com.weison.sbm.domain.StudentScores;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomizedStudentRepository {

    public StudentScore findStudentScoreByName(String name);

    public List<Student> findStudentListByAgeAndSexAndHobbies();

    public List<StudentScores> findStudentScoreList();

    public List<StudentScore> findStudentScores();
}
