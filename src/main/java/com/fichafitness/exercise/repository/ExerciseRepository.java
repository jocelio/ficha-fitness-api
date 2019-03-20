package com.fichafitness.exercise.repository;

import com.fichafitness.exercise.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Integer>{

}
