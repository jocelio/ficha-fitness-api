package com.fichafitness.exercise.api;

import com.fichafitness.exercise.model.ExerciseGroup;
import com.fichafitness.exercise.model.Exercise;
import com.fichafitness.exercise.repository.ExerciseGroupRepository;
import com.fichafitness.exercise.repository.ExerciseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
@AllArgsConstructor
public class ExerciseController {

	private ExerciseRepository exerciseRepository;

	private ExerciseGroupRepository exerciseGroupRepository;

	@GetMapping
	public List<Exercise> get() {
		return exerciseRepository.findAll();
	}

	@PostMapping
	public Exercise add(@RequestBody Exercise exercise) {

		if(exercise.getExerciseGroup().getName() != null && exercise.getExerciseGroup().getId() == null){
			ExerciseGroup exerciseGroup = exerciseGroupRepository.save(exercise.getExerciseGroup());
			exercise.setExerciseGroup(exerciseGroup);
		}

		return exerciseRepository.save(exercise);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable(value = "id") Integer id) {
		exerciseRepository.delete(id);
	}

	@GetMapping("/group")
	public List<ExerciseGroup> getGroups() {
		return exerciseGroupRepository.findAll();
	}

	@PostMapping("/group")
	public ExerciseGroup addGroup(@RequestBody ExerciseGroup exerciseGroup) {
		return exerciseGroupRepository.save(exerciseGroup);
	}

	@DeleteMapping("/group/{id}")
	public void deleteGroup(@PathVariable(value = "id") Integer id) {
		exerciseGroupRepository.delete(id);
	}

}
