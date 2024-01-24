package com.example.demo.service;


import com.example.demo.model.Discipline;
import com.example.demo.model.Test;
import com.example.demo.repository.DisciplineRepository;
import com.example.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;
    @Autowired
    private DisciplineRepository disciplineRepository;

    public Test save(Test test, String discipline_title){
        Discipline discipline = disciplineRepository.findByTitle(discipline_title);
        test.setDiscipline(discipline);
        return testRepository.save(test);
    }

    public Test findByTitle(String title){
        return testRepository.findByTitle(title);
    }

    public List<Test> findAll(){
        return (List<Test>) testRepository.findAll();
    }

    public Test findById(Long id){
        return testRepository.findById(id).get();
    }
}
