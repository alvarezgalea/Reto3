/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Modelo.Cloud;
import com.example.demo.Servicio.CloudService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author MIGUEL ANGEL ALVAREZ G.
 */
@RestController
@RequestMapping("/api/Cloud")

public class CloudController {
      @Autowired
    private CloudService cloudService;
    
    @GetMapping("/all")
    public List<Cloud> getAll(){
        return cloudService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Cloud> getCloud(@PathVariable("id") int id){
        return cloudService.getCloud(id);
    } 
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cloud save (@RequestBody Cloud cloud){
        return cloudService.save(cloud);
    }
}
