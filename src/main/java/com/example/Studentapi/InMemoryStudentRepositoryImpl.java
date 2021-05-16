package com.example.Studentapi;

import java.util.HashMap;
import java.util.Map;


public class InMemoryStudentRepositoryImpl implements StudentRepository {

    @Override
    public void save(Student student) {

        //todo: save this student in the database
        databse.put(student.id, student);
        System.out.println("student saved in the ");

    }
}
