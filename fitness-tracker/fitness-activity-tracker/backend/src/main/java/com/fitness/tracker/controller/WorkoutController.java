package com.fitness.tracker.controller;

import com.fitness.tracker.model.Workout;
import com.fitness.tracker.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
@CrossOrigin(origins = "*")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @PostMapping
    public ResponseEntity<Workout> addWorkout(@RequestBody Workout workout) {
        // In a real app, you'd fetch the user from the context/session,
        // but for simplicity we assume the client sends the user object or ID in the
        // body.
        return ResponseEntity.ok(workoutService.addWorkout(workout));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Workout>> getWorkouts(@PathVariable Long userId) {
        return ResponseEntity.ok(workoutService.getWorkoutsByUserId(userId));
    }
}
