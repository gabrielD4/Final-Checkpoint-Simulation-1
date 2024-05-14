package com.example.checkpoint1.services;

import com.example.checkpoint1.repositories.ExerciseRepository;
import com.example.checkpoint1.entities.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public Exercise createExercise(Exercise exercise) {
        if (exerciseRepository.findByExerciseIdAndStudentId(exercise.getExerciseId(), exercise.getStudentId()).isPresent()) {
            throw new IllegalArgumentException("Exercise already exist");
        }
        return exerciseRepository.save(exercise);
    }

    public void updateMark(int marks, long exerciseID) {
        exerciseRepository.updateMarksInExerciseByExerciseId(marks, exerciseID);
    }

    public Collection<Exercise> retrieveAllExercise() {
        return exerciseRepository.findAll();
    }

    public Collection<Exercise> getExerciseByStudentId(long studentId) {
        return exerciseRepository.findExerciseByStudentId(studentId);
    }
}
