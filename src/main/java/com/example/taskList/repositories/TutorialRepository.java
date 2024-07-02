package com.example.taskList.repositories;

import com.example.taskList.models.tutorialJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends JpaRepository<tutorialJpa, Long> {


}
