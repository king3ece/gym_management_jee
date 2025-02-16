package com.king3ece.back_gym_management.controllers;


import com.king3ece.back_gym_management.models.Pack;
import com.king3ece.back_gym_management.services.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PackController {

    @Autowired
    private PackService packService;
    @PostMapping("/create")
    public Pack create(@RequestBody Pack pack){
        return packService.addPack(pack);
    };

    @GetMapping("/all")
    public List<Pack> getPack(){
        return packService.getPack();
    }

//    @GetMapping("/{id}")
//    public Optional<Pack> getPack(@PathVariable Long id){
//        return packService.getPack(id);
//    }

    @PutMapping("/update/{id}") //?name=king3ece login/AZE
    public Pack updatePack(@PathVariable Long id, @RequestBody Pack pack){
        return packService.updatePack(id, pack);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePack(@PathVariable Long id){
        return packService.deletePack(id);
    }
}
