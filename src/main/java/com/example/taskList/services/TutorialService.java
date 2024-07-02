package com.example.taskList.services;

import com.example.taskList.models.tutorialJpa;
import com.example.taskList.repositories.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TutorialService {

    @Autowired
    TutorialRepository tutorialRepository;

    public ArrayList<tutorialJpa> getTutorials(){
        return (ArrayList<tutorialJpa>) tutorialRepository.findAll();
    }
}
