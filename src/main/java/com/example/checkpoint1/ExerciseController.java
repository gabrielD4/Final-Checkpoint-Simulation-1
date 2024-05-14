package com.example.checkpoint1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/v1/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping
    public ResponseEntity<Exercise> insertNewExercise(@RequestBody Exercise exercise) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(exerciseService.createExercise(exercise));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/{exerciseId}")
    public void updateExercise(@PathVariable long exerciseId, @RequestParam int marks) {
       exerciseService.updateMark(marks, exerciseId);
    }

    @GetMapping
    public Collection<Exercise> retrieveALlExercise(){
        return exerciseService.retrieveAllExercise();
    }

    @GetMapping("/{studentId}")
    public Collection<Exercise> retrieveExercisesByStudentId(@PathVariable long studentId){
        return exerciseService.getExerciseByStudentId(studentId);
    }
}
