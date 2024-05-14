package com.example.checkpoint1.repositories;

import com.example.checkpoint1.entities.Exercise;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.Optional;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    Optional<Exercise> findByExerciseIdAndStudentId(long exerciseId, long studentId);

    @Transactional
    @Modifying
    @Query("update Exercise e set e.marks = :marks where e.exerciseId = :exerciseId")
    void updateMarksInExerciseByExerciseId(int marks, long exerciseId);

    Collection<Exercise> findExerciseByStudentId(long studentId);
}

