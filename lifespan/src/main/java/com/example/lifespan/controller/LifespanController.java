package com.example.lifespan.controller;

import com.example.lifespan.model.LifespanRequest;
import com.example.lifespan.service.LifespanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/lifespan")
public class LifespanController {

    private final LifespanService lifespanService;

    public LifespanController(LifespanService lifespanService) {
        this.lifespanService = lifespanService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<?> calculate(@RequestBody LifespanRequest request) {
        try {
            Map<String, Object> result = lifespanService.calculate(
                    request.getDateOfBirth(),
                    request.getExpectedYears()
            );
            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }
}