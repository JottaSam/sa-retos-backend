package com.grupog35.reto3.controller;

import com.grupog35.reto3.model.ScoreModel;
import com.grupog35.reto3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/all")
    public List<ScoreModel> obtenerGamas(){
        return scoreService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crearGamas(@RequestBody ScoreModel score){
        scoreService.crear(score);
    }

}
