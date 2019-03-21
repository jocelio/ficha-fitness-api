package com.fichafitness.exercise.repository;

import com.fichafitness.exercise.model.ExerciseGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseGroupRepository extends JpaRepository<ExerciseGroup, Integer>{

}
