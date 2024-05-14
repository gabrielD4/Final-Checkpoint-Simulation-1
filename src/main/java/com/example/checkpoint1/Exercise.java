package com.example.checkpoint1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Exercise {

    @Id
    @GeneratedValue
    private long submissionId;

    private long exerciseId;

    private long studentId;

    private int marks;

    public Exercise() {
    }

    public Exercise(long submissionId, long id, long studentId, int marks) {
        this.submissionId = submissionId;
        this.exerciseId = id;
        this.studentId = studentId;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public long getExerciseId() {
        return exerciseId;
    }

    public long getStudentId() {
        return studentId;
    }

    public long getSubmissionId() {
        return submissionId;
    }
}
