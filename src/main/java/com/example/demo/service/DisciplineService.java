package com.example.demo.service;

import com.example.demo.model.Discipline;
import com.example.demo.repository.DisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplineService {
    @Autowired
    private DisciplineRepository disciplineRepository;
    public Discipline save(Discipline discipline){
        return disciplineRepository.save(discipline);
    }
    public List<Discipline> findAll(){
        return (List<Discipline>) disciplineRepository.findAll();
    }
}
