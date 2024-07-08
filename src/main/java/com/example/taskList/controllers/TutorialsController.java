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
import com.example.taskList.service.TutorialService;

@RestController
@RequestMapping("/tutorial")
public class TutorialsController {

    @Autowired
    private TutorialService TutorialService;

    @GetMapping
    public ArrayList<Tutorials> getUsers() {
        return this.userService.getUsers();
    }

    @PostMapping
    public Tutorials saveUser(@RequestBody Tutorials tutorial) {
        return this.userService.saveUser(tutorial);
    }

    @GetMapping(path = "/{id}")
    public Optional<Tutorials> getUserById(@PathVariable("id") Long id) {
        return this.userService.getById(id);
    }

    @PutMapping
    public Tutorials updateTutorial(@RequestBody Tutorials tutorial) {
        return this.userService.updateById(tutorial);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.userService.deleteUser(id);

        if (ok)
            return "User with id " + id + " as deleted";
        else
            return "Error, we have a problem to deleted user " + id;
    }
}
