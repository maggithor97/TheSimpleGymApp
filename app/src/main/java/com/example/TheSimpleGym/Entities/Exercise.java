package com.example.TheSimpleGym.Entities;


public class Exercise {
    private long ID;

    private String exerciseName;
    private int repetitions;
    private String duration;

    public Exercise() {
    }
    private Workout workout;

    public Exercise(String ExerciseName, int repetitions, String duration, Workout workout) {
        exerciseName = ExerciseName;
        this.repetitions = repetitions;
        this.duration = duration;
        this.workout = workout;
    }

    public Exercise(String ExerciseName, int repetitions) {
        exerciseName = ExerciseName;
        this.repetitions = repetitions;
    }

    public Exercise(String ExerciseName, String duration) {
        exerciseName = ExerciseName;
        this.duration = duration;
    }



    public long getID() {
        return ID;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public Workout getWorkout(){return workout;}

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setExerciseName(String ExerciseName) {
        exerciseName = ExerciseName;
    }

    public void setWorkout(Workout workout){this.workout = workout;}
}
