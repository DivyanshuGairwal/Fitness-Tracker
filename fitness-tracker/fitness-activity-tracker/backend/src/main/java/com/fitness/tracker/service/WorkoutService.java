package com.fitness.tracker.service;

import com.fitness.tracker.model.Workout;
import com.fitness.tracker.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    public Workout addWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public List<Workout> getWorkoutsByUserId(Long userId) {
        return workoutRepository.findByUserIdOrderByDateDesc(userId);
    }
}
