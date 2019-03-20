package com.fichafitness.exercise.api;

import com.fichafitness.exercise.model.Exercise;
import com.fichafitness.exercise.repository.ExerciseRepository;
import com.fichafitness.fila.model.Driver;
import com.fichafitness.fila.repository.DriverRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
@AllArgsConstructor
public class ExerciseController {

	private ExerciseRepository exerciseRepository;

	@GetMapping
	public List<Exercise> get() {
		return exerciseRepository.findAll();
	}

	@PostMapping
	public Exercise add(@RequestBody Exercise exercise) {
		return exerciseRepository.save(exercise);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable(value = "id") Integer id) {
		exerciseRepository.delete(id);
	}

}
