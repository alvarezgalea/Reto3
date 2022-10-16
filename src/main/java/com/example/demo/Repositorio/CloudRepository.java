/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.CloudInterface;
import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Cloud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author MIGUEL ANGEL ALVAREZ G.
 */

@Repository

public class CloudRepository {
     @Autowired
    private CloudInterface extencionesCrud;
    
    public List<Cloud> getAll(){
        return (List<Cloud>) extencionesCrud.findAll();
    }
    
    public Optional<Cloud> getCloud(int id){
        return extencionesCrud.findById(id);
    }
    
    public Cloud save(Cloud cloud){
        return extencionesCrud.save(cloud);
    }
}
