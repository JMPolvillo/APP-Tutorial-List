package com.example.taskList.controllers;


    


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskList.models.Tutorials;
import com.example.taskList.service.TutorialService;//modificar el service

@RestController
@RequestMapping("/tutorial")
public class TutorialsController {

    @Autowired
    private TutorialService TutorialService;

    @GetMapping
    public ArrayList<Tutorials> getTutorials() {
        return this.userService.getTutorials();//modificar el service
    }

    @PostMapping
    public Tutorials saveUser(@RequestBody Tutorials tutorial) {
        return this.userService.saveTutorial(tutorial);//modificar el service
    }

    @GetMapping(path = "/{id}")
    public Optional<Tutorials> getUserById(@PathVariable("id") Long id) {
        return this.userService.getById(id); //modificar el service
    }

    @PutMapping
    public Tutorials updateTutorial(@RequestBody Tutorials tutorial) {
        return this.userService.updateById(tutorial); //modificar el service
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.userService.deleteTutorial(id);//modificar el service

        if (ok)
            return "Tutorial with id " + id + " as deleted";
        else
            return "Error, we have a problem to deleted tutorial " + id;
    }
}
